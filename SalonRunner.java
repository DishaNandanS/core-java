class SalonRunner {
public static void main(String[] args) {

Salon[] salons = new Salon[4];

Salon s1 = new Salon();
s1.setName("Glamour");
s1.setNoOfEmployees(10);
s1.setOffersSpa(true);

Salon s2 = new Salon();
s2.setName("StyleHub");
s2.setNoOfEmployees(8);
s2.setOffersSpa(false);

Salon s3 = new Salon();
s3.setName("BeautyZone");
s3.setNoOfEmployees(12);
s3.setOffersSpa(true);

Salon s4 = new Salon();
s4.setName("ChicSalon");
s4.setNoOfEmployees(9);
s4.setOffersSpa(false);

for (int i = 0; i < salons.length; i++) {
if (i == 0) {
salons[i] = s1;
} else if (i == 1) {
salons[i] = s2;
} else if (i == 2) {
salons[i] = s3;
} else if (i == 3) {
salons[i] = s4;
}
}

for (int i = 0; i < salons.length; i++) {
Salon s = salons[i];
if (s != null) {
System.out.println(s.getName());
System.out.println(s.getNoOfEmployees());
System.out.println(s.isOffersSpa());
}
}
}
}
