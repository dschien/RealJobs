package realjobs.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*
import realjobs.ReLogoTurtle

/**
 * Worker Agent
 * @author schien
 *
 */
class Worker extends ReLogoTurtle {
	
	Job job = null
	double increment = 1
	
	/**
	 * Increment completion level by increment if completion level less than requirements
	 * @return
	 */
	def step(){
		if (this.job && this.job.completionLevel < this.job.requirements){
			this.job.completionLevel += increment
		}
		
		
	}
	
	/**
	 * Check if job done.
	 * @return true if done, false otherwise
	 */
	def isJobDone(){
		if (this.job && this.job.completionLevel >= this.job.requirements){
			return true
		}
		return  false
	}
}
