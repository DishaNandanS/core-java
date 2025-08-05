class MakeupRunner {
public static void main(String[] args) {

Makeup[] makeups = new Makeup[4];

Makeup m1 = new Makeup();
m1.setBrand("Maybelline");
m1.setType("Lipstick");
m1.setCost(500);

Makeup m2 = new Makeup();
m2.setBrand("Lakme");
m2.setType("Foundation");
m2.setCost(700);

Makeup m3 = new Makeup();
m3.setBrand("Revlon");
m3.setType("Eyeliner");
m3.setCost(450);

Makeup m4 = new Makeup();
m4.setBrand("L'Oreal");
m4.setType("Mascara");
m4.setCost(600);

for (int i = 0; i < makeups.length; i++) {
if (i == 0) {
makeups[i] = m1;
} else if (i == 1) {
makeups[i] = m2;
} else if (i == 2) {
makeups[i] = m3;
} else if (i == 3) {
makeups[i] = m4;
}
}

for (int i = 0; i < makeups.length; i++) {
Makeup m = makeups[i];
if (m != null) {
System.out.println(m.getBrand());
System.out.println(m.getType());
System.out.println(m.getCost());
}
}
}
}
