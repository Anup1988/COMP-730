import java.util.ArrayList;
import java.util.List;

public class WorkManager implements Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
			observers.remove(o);
	}

	@Override
	public void notifyObserver(WorkItem workItem) {
		
		for(Observer o : observers) {
			
			
			
		}
		
	}
	
	
	
	
	
}
