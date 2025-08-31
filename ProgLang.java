package ProgLang;
//assignment
//Write a program for Single level inheritance Multi level inheritance Heirarchical inheritance
//using Constructor chaining super()
public class ProgLang {
//Hierarchical inheritance
	public String Name;
	int version;
	boolean easyToUse;
	
	public ProgLang() {
		
	}
	
	public ProgLang(String Name, boolean easyToUse,  int version) {
		this.Name=Name;
		this.version=version;
		this.easyToUse=easyToUse;
	}
}
