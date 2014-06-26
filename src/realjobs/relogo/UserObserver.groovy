package realjobs.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*
import realjobs.ReLogoObserver
import repast.simphony.engine.environment.RunEnvironment
import repast.simphony.relogo.Stop
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class UserObserver extends ReLogoObserver{

	def openJobs = [] as Queue
	def doneJobs = [] as Queue

	@Setup
	def setup(){
		clearAll()
		this.openJobs = [] as Queue
		this.doneJobs = [] as Queue

		(0..<numJobs).each{
			this.openJobs << new Job(requirements:numRequirements)
		}

		createWorkers(numWorkers){ it ->
			it.increment = this.workIncrement
		}
	}

	@Go
	def go(){
		int idleWorkers = 0

		ask(workers()){ worker ->
			if (!worker.job) {
				if (this.openJobs){
					worker.job = this.openJobs.poll()
				} else {
					// all jobs done
					idleWorkers ++

				}
			}
			// let the worker work on it
			worker.step()

			if (worker.isJobDone()){
				this.doneJobs << worker.job
				worker.job = null
			}
		}
		// we've completed our work
		if (idleWorkers == numWorkers){
			RunEnvironment.getInstance().endRun();
		}
	}

	def getNumOpenJobs(){
		return this.openJobs.size()
	}

	def getNumDoneJobs(){
		return this.doneJobs.size()
	}

}