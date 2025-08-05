class Hostel11 {
private String hostelName;
private int numberOfRooms;
private String location;

static String[] hostelFacilities = {"WiFi", "Laundry", "Mess", "Gym"};

public static String[] getHostelFacilities() {
return hostelFacilities;
}

public void setHostelName(String hostelName) {
this.hostelName = hostelName;
}

public String getHostelName() {
return hostelName;
}

public void setNumberOfRooms(int numberOfRooms) {
this.numberOfRooms = numberOfRooms;
}

public int getNumberOfRooms() {
return numberOfRooms;
}

public void setLocation(String location) {
this.location = location;
}

public String getLocation() {
return location;
}
}
