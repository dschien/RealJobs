package realjobs;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoObserver extends BaseObserver{

	/**
	 * Makes a number of randomly oriented workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> createWorkers(int number, Closure closure) {
		AgentSet<realjobs.relogo.Worker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"Worker");
		for (Turtle t : createResult){
			if (t instanceof realjobs.relogo.Worker){
				result.add((realjobs.relogo.Worker)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> createWorkers(int number) {
		return createWorkers(number,null);
	}

	/**
	 * Makes a number of uniformly fanned workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> createOrderedWorkers(int number, Closure closure) {
		AgentSet<realjobs.relogo.Worker> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"Worker");
		for (Turtle t : createResult){
			if (t instanceof realjobs.relogo.Worker){
				result.add((realjobs.relogo.Worker)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned workers and then executes a set of commands on the
	 * created workers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created workers
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> createOrderedWorkers(int number) {
		return createOrderedWorkers(number,null);
	}

	/**
	 * Queries if object is a worker.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a worker
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public boolean isWorkerQ(Object o){
		return (o instanceof realjobs.relogo.Worker);
	}

	/**
	 * Returns an agentset containing all workers.
	 * 
	 * @return agentset of all workers
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> workers(){
		AgentSet<realjobs.relogo.Worker> a = new AgentSet<realjobs.relogo.Worker>();
		for (Object e : this.getContext().getObjects(realjobs.relogo.Worker.class)) {
			if (e instanceof realjobs.relogo.Worker){
				a.add((realjobs.relogo.Worker)e);
			}
		}
		return a;
	}

	/**
	 * Returns the worker with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public realjobs.relogo.Worker worker(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof realjobs.relogo.Worker)
			return (realjobs.relogo.Worker) turtle;
		return null;
	}

	/**
	 * Returns an agentset of workers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of workers on patch p
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> workersOn(Patch p){
		AgentSet<realjobs.relogo.Worker> result = new AgentSet<realjobs.relogo.Worker>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"worker")){
			if (t instanceof realjobs.relogo.Worker)
			result.add((realjobs.relogo.Worker)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of workers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of workers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> workersOn(Turtle t){
		AgentSet<realjobs.relogo.Worker> result = new AgentSet<realjobs.relogo.Worker>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"worker")){
			if (tt instanceof realjobs.relogo.Worker)
			result.add((realjobs.relogo.Worker)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of workers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of workers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.Worker")
	public AgentSet<realjobs.relogo.Worker> workersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<realjobs.relogo.Worker>();
		}

		Set<realjobs.relogo.Worker> total = new HashSet<realjobs.relogo.Worker>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(workersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(workersOn(p));
				}
			}
		}
		return new AgentSet<realjobs.relogo.Worker>(total);
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> createUserTurtles(int number, Closure closure) {
		AgentSet<realjobs.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.crt(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof realjobs.relogo.UserTurtle){
				result.add((realjobs.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of randomly oriented userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> createUserTurtles(int number) {
		return createUserTurtles(number,null);
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> createOrderedUserTurtles(int number, Closure closure) {
		AgentSet<realjobs.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.cro(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof realjobs.relogo.UserTurtle){
				result.add((realjobs.relogo.UserTurtle)t);
			}
		} 
		return result; 
	}

	/**
	 * Makes a number of uniformly fanned userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> createOrderedUserTurtles(int number) {
		return createOrderedUserTurtles(number,null);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof realjobs.relogo.UserTurtle);
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> userTurtles(){
		AgentSet<realjobs.relogo.UserTurtle> a = new AgentSet<realjobs.relogo.UserTurtle>();
		for (Object e : this.getContext().getObjects(realjobs.relogo.UserTurtle.class)) {
			if (e instanceof realjobs.relogo.UserTurtle){
				a.add((realjobs.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public realjobs.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), this);
		if (turtle instanceof realjobs.relogo.UserTurtle)
			return (realjobs.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<realjobs.relogo.UserTurtle> result = new AgentSet<realjobs.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),this,"userTurtle")){
			if (t instanceof realjobs.relogo.UserTurtle)
			result.add((realjobs.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<realjobs.relogo.UserTurtle> result = new AgentSet<realjobs.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),this,"userTurtle")){
			if (tt instanceof realjobs.relogo.UserTurtle)
			result.add((realjobs.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserTurtle")
	public AgentSet<realjobs.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<realjobs.relogo.UserTurtle>();
		}

		Set<realjobs.relogo.UserTurtle> total = new HashSet<realjobs.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<realjobs.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof realjobs.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserLink")
	public AgentSet<realjobs.relogo.UserLink> userLinks(){
		AgentSet<realjobs.relogo.UserLink> a = new AgentSet<realjobs.relogo.UserLink>();
		for (Object e : this.getContext().getObjects(realjobs.relogo.UserLink.class)) {
			if (e instanceof realjobs.relogo.UserLink){
				a.add((realjobs.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserLink")
	public realjobs.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (realjobs.relogo.UserLink)(this.getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("realjobs.relogo.UserLink")
	public realjobs.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numWorkers.
	 *
	 * @return the value of the global variable numWorkers
	 */
	@ReLogoBuilderGeneratedFor("global: numWorkers")
	public Object getNumWorkers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numWorkers");
	}

	/**
	 * Sets the value of the global variable numWorkers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numWorkers")
	public void setNumWorkers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numWorkers",value);
	}

	/**
	 * Returns the value of the global variable numRequirements.
	 *
	 * @return the value of the global variable numRequirements
	 */
	@ReLogoBuilderGeneratedFor("global: numRequirements")
	public Object getNumRequirements(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numRequirements");
	}

	/**
	 * Sets the value of the global variable numRequirements.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numRequirements")
	public void setNumRequirements(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numRequirements",value);
	}

	/**
	 * Returns the value of the global variable numJobs.
	 *
	 * @return the value of the global variable numJobs
	 */
	@ReLogoBuilderGeneratedFor("global: numJobs")
	public Object getNumJobs(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numJobs");
	}

	/**
	 * Sets the value of the global variable numJobs.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numJobs")
	public void setNumJobs(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numJobs",value);
	}

	/**
	 * Returns the value of the global variable workIncrement.
	 *
	 * @return the value of the global variable workIncrement
	 */
	@ReLogoBuilderGeneratedFor("global: workIncrement")
	public Object getWorkIncrement(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("workIncrement");
	}

	/**
	 * Sets the value of the global variable workIncrement.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: workIncrement")
	public void setWorkIncrement(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("workIncrement",value);
	}


}