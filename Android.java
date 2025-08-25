package Mobile;

public class Android extends Mobile{

	private long storage;
	private String name;
	
	public Android() {}
	public Android(long storage, String name) {
		this.storage=storage;
		this.name=name;
	}	
		public void getMobile() {
			
			System.out.println("storage: " + storage);
			System.out.println("Name: " + name);
	}
	
}
