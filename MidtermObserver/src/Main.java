
public class Main {
	
	public static void main(String[] args) {
		
		WorkManager publisher1 = new WorkManager();
		Worker worObj1 = new Worker(1);
		Worker worObj2 = new Worker(2);
		Worker worObj3 = new Worker(3);
		Worker worObj4 = new Worker(4);
		
		publisher1.register(worObj1);
		publisher1.register(worObj2);
		publisher1.register(worObj3);
		publisher1.register(worObj4);
		
		WorkItem item1 = new WorkItem(1,"Work 1","1");
		WorkItem item2 = new WorkItem(3,"Work 2","3");
		WorkItem item3 = new WorkItem(5,"Work 3","5");
		
		
		publisher1.notifyObserver(item1);
		publisher1.notifyObserver(item2);
		publisher1.notifyObserver(item3);
		
		
		
	}
	
}
