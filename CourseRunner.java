class CourseRunner {
public static void main(String[] args) {
Course[] course = new Course[2];

Course course1 = new Course();
course1.setName("HTML");
course1.setNumberOfCourses(400);
course1.setDomain("IT");

course[0] = course1;

Course course2 = new Course();
course2.setName("Css");
course2.setNumberOfCourses(3456);
course2.setDomain("Scientist");

course[1] = course2;

for (int i = 0; i < course.length; i++) {
System.out.println("Course======== " + (i + 1));
System.out.println("Name: " +course[i].getName());
System.out.println("number od courses: " + course[i].getNumberOfCourses());
System.out.println("Domain: " + course[i].getDomain());
}

String[] courNames = Course.getCourNames();
System.out.println("Available Course Names:");
for (int i = 0; i < courNames.length; i++) {
System.out.println(courNames[i]);
}
}
} 
