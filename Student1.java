package interfaceHw;

public class Student1 implements School {
	
	public void totalMarks() {
		System.out.println("total marks obtained by student1 : " + 480);	
		}
	
	public void studentGrade() {
		System.out.println("grade obtained by student1: " + 'B');
	}
	//private void bloodGroup() { //wont work
	void bloodGroup() {
		System.out.println("blood group of Student1 : " + "O+");
	}
}

   