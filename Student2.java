package interfaceHw;

public class Student2 implements School {
	public void totalMarks() {
		System.out.println("total marks obtained by student2 is: " + 540);
	}
	public void studentGrade() {
		System.out.println("grade obtained by student2: " + 'A');
	}
	protected void studentHeight() {
		System.out.println("height of the student2: " + 6.3f);
	}
}