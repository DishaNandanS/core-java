package President;

public class PrimeMinister extends President {

	public void primeMinisterInfo() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		name="Narendra Modi";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		super.name="Rahul Gandhi";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
}
