package realjobs.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		addSliderWL ("numWorkers", "Number of Workers", 1 , 1 , 1000 , 11)
		addSliderWL ("numRequirements", "Number of Requirements", 1 , 1 , 10000 , 1000)        
		addSliderWL ("numJobs", "Number of Jobs", 1 , 1 , 10000 , 1000)        
        addSliderWL ("workIncrement", "Requirements solved per step", 1 , 1 , 100 , 10)
	}
}