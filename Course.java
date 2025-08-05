class Course {
private String name;
private int numberOfCourses;
private String domain;

static String[] courNames = {"Java", "Python", "JavaScript", "DSA"};
public static String[] getCourNames() {
return courNames;
}

public void setName(String name) {
this.name = name;
}
public String getName() {
return name;
}

public void setNumberOfCourses(int numberOfCourses) {
this.numberOfCourses = numberOfCourses;
}
public int getNumberOfCourses() {
return numberOfCourses;
}

public void setDomain(String domain) {
this.domain= domain;
}
public String getDomain() {
return domain;
}
}
