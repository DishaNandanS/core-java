package Mobile;

public class Ios extends Mobile{

	private boolean security;
	
	public Ios() {
		
	}
	public Ios(boolean security) {
		this.security=security;
		
	}
	public void iosInfo() {
		System.out.println("Security: " + security);
	}
}
