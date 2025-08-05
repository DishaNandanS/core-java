class Hostel11Runner {
public static void main(String[] args) {
Hostel11[] hostels = new Hostel11[2];
// 0 index
Hostel11 hostel1 = new Hostel11();// obj
hostel1.setHostelName("GreenField Hostel");
hostel1.setNumberOfRooms(120);
hostel1.setLocation("Bangalore");

hostels[0] = hostel1;
// 1 index
Hostel11 hostel2 = new Hostel11();//obj
hostel2.setHostelName("SunRise Hostel");
hostel2.setNumberOfRooms(90);
hostel2.setLocation("Mysore");

hostels[1] = hostel2;  // if we use hostels[0] = hostel2(no error, it replacesffffffffffff

for (int i = 0; i < hostels.length; i++) {
System.out.println("Hostel======== " + (i + 1));
System.out.println("Name: " + hostels[i].getHostelName());
System.out.println("Rooms: " + hostels[i].getNumberOfRooms());
System.out.println("Location: " + hostels[i].getLocation());
}

System.out.println("Available Hostel Facilities:");
for (String facility : Hostel11.getHostelFacilities()) {
System.out.println(facility);
}
}
}
