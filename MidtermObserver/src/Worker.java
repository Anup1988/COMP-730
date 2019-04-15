
public class Worker implements Observer {

	private long WorkerID;

	public Worker(long WorkerID) {

		this.WorkerID = WorkerID;

	}

	public WorkItem notify(WorkItem item) {
		
		if (item.getItemId() != WorkerID) {
				
			return null;
		}
		
		if(item.getItemId() == WorkerID)
		{
			System.out.println("Worker "+ WorkerID + "Processed WorkItem "+ item.getItemId() + "message" + item.getMessage());
			item.getItemID()++;
			 return item;
		}
	}
}
