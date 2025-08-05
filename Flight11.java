//homwework 29/7/25
//Create 10 class with private instance variables , having setter
//to initialize the variable , and getter

class Flight11 {
private String flightName;
private int flightNumber;
private String destination;

static String[] crewMembers = {"Captain Siri", "Co-Pilot Alex", "Crew Bixbi"};
public static String[] getCrewMembers() {
return crewMembers;
}
public void setFlightName(String flightName) {
this.flightName = flightName;
}
public String getFlightName() {
return this.flightName;
}
public void setFlightNumber(int flightNumber) {
this.flightNumber = flightNumber;
}
public int getFlightNumber() {
return this.flightNumber;
}
public void setDestination(String destination) {
this.destination = destination;
}
public String getDestination() {
return this.destination;
}
}
