package College;

public class Department extends College {
	//String name;
	//int noOfDepartment;
	//double fees;
	//boolean isGoodCollege;
	
	public void departmentInfo() {
		System.out.println(name);
		System.out.println(noOfDepartment);
		System.out.println(fees);
		System.out.println(isGoodCollege);
		
		System.out.println("1----------------");
		name = "vtu";
		noOfDepartment=11;
		fees=78000d;
		isGoodCollege=true;
		System.out.println(name);
		System.out.println(noOfDepartment);
		System.out.println(fees);
		System.out.println(isGoodCollege);
		
		System.out.println("2--------------------");
		super.name= "rv";
		super.fees=99000;
		this.noOfDepartment=8;
		this.isGoodCollege=false;
		
		System.out.println(name);//y rv?
		System.out.println(noOfDepartment);// y it is executing this.depart not depart?
		System.out.println(fees);
		System.out.println(isGoodCollege);
		System.out.println("3--------------------");
		
		name= "reva";
		System.out.println(this.name);
		System.out.println(this.noOfDepartment);
		System.out.println(this.fees);
		System.out.println(this.isGoodCollege);
		
System.out.println("4-------------------");
		
		System.out.println(super.name);
		System.out.println(noOfDepartment);
		System.out.println(super.fees);
		System.out.println(isGoodCollege);
		
	}
	
}
