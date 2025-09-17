package interfaceHw;
//package should start with com. / name.org
public class SchoolRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school1 = new Student1();
		school1.totalMarks();
		school1.studentGrade();
		
		
		Student1 std1 = new Student1();
		// by using class in object it doesnt work becoz it is not inherited
		std1.bloodGroup();// with private it doesnt work, without variable as void it works
		//which created object by using its class name it works
		
		
		System.out.println("-----------------------------------------------");
		Student2 std = new Student2();
		std.totalMarks();
		std.studentGrade();
		std.studentHeight();
	}
}
