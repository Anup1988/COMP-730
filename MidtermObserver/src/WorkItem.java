
public class WorkItem {
	
	private String ItemId;
	private long WorkerID;
	private String message;
	
	
	public WorkItem(long WorkerId, String message, String ItemId) {
		this.WorkerID = WorkerId;
		this.message = message;
		this.ItemId = ItemId;
		
	}
	
	
	public String getItemId() {
		return ItemId;
	}

	public void setItemId(String itemId) {
		ItemId = itemId;
	}

	public long getWorkerID() {
		return WorkerID;
	}

	public void setWorkerID(long workerID) {
		WorkerID = workerID;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
