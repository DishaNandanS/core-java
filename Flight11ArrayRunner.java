class Flight11ArrayRunner {
public static void main(String[] args) {
Flight11[] flights = new Flight11[2];

Flight11 flight1 = new Flight11();
flight1.setFlightName("IndiGo");
flight1.setFlightNumber(0123);
flight1.setDestination("BLR to DEL");

flights[0] = flight1;

Flight11 flight2 = new Flight11();
flight2.setFlightName("Air India");
flight2.setFlightNumber(173);
flight2.setDestination("BLR to Kash");

flights[1] = flight2;

for (int i = 0; i < flights.length; i++) {
System.out.println("Flight ======= " + (i + 1));
System.out.println("Name: " + flights[i].getFlightName());
System.out.println("Number: " + flights[i].getFlightNumber());
System.out.println("Destination: " + flights[i].getDestination());
}

System.out.println("Crew Members:");
for (String crew : Flight11.getCrewMembers()) {
System.out.println(crew);
}
}
}
