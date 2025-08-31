package ProgLang;

public class Java extends ProgLang{

	int whichYear;
	
	public Java() {
		
	}
	public Java(String Name, boolean easyToUse, int version, int whichYear) {
		super(Name, easyToUse, version);
		this.whichYear=whichYear;
	}
	
	public void details() {
		System.out.println("name:" + Name + "version: " + version + "easyToUse:" + easyToUse + "whichYear:" + whichYear);
	}
}
