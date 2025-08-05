class SingerRunner {
public static void main(String[] args) {

Singer[] singers = new Singer[4];

Singer s1 = new Singer();
s1.setName("Adele");
s1.setAge(33);
s1.setGenre("Pop");

Singer s2 = new Singer();
s2.setName("Ed Sheeran");
s2.setAge(29);
s2.setGenre("Pop");

Singer s3 = new Singer();
s3.setName("Beyonce");
s3.setAge(39);
s3.setGenre("R&B");

Singer s4 = new Singer();
s4.setName("Bruno Mars");
s4.setAge(35);
s4.setGenre("Funk");

for (int i = 0; i < singers.length; i++) {
if (i == 0) {
singers[i] = s1;
} else if (i == 1) {
singers[i] = s2;
} else if (i == 2) {
singers[i] = s3;
} else if (i == 3) {
singers[i] = s4;
}
}

for (int i = 0; i < singers.length; i++) {
Singer s = singers[i];
if (s != null) {
System.out.println(s.getName());
System.out.println(s.getAge());
System.out.println(s.getGenre());
}
}
}
}
