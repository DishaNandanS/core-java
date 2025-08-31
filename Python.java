package ProgLang;

public class Python extends ProgLang {

	String founderName;
	
	public Python() {
		
	}
	
	public Python(String Name, int version, boolean easyToUse, String founderName) {
		super(Name, easyToUse, version);
		this.founderName=founderName;
		
	}
	
	public void details() {
		System.out.println(Name);
		System.out.println(version);
		System.out.println(easyToUse);
		System.out.println(founderName);
	}
}
