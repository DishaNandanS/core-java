class VegetablesRunner {
public static void main(String[] args) {

Vegetables[] vegetables = new Vegetables[4];

Vegetables veg1 = new Vegetables();
veg1.setName("Tomato");
veg1.setColor("Red");
veg1.setPricePerKg(30.5);

Vegetables veg2 = new Vegetables();
veg2.setName("Potato");
veg2.setColor("Brown");
veg2.setPricePerKg(20.0);

Vegetables veg3 = new Vegetables();
veg3.setName("Carrot");
veg3.setColor("Orange");
veg3.setPricePerKg(40.0);

Vegetables veg4 = new Vegetables();
veg4.setName("Cabbage");
veg4.setColor("Green");
veg4.setPricePerKg(25.0);

for (int i = 0; i < vegetables.length; i++) {
if (i == 0) {
vegetables[i] = veg1;
} else if (i == 1) {
vegetables[i] = veg2;
} else if (i == 2) {
vegetables[i] = veg3;
} else if (i == 3) {
vegetables[i] = veg4;
}
}

for (int i = 0; i < vegetables.length; i++) {
Vegetables veg = vegetables[i];
if (veg != null) {
System.out.println(veg.getName());
System.out.println(veg.getColor());
System.out.println(veg.getPricePerKg());
}
}
}
}
