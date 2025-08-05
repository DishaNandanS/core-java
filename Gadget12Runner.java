class Gadget12Runner {
public static void main(String[] args) {
Gadget12[] gadgets = new Gadget12[2];

Gadget12 gadget1 = new Gadget12();
gadget1.setGadgetName("iPhone 15");
gadget1.setPrice(79999.00);
gadget1.setType("Smartphone");
gadgets[0] = gadget1;

Gadget12 gadget2 = new Gadget12();
gadget2.setGadgetName("iPad Air");
gadget2.setPrice(59999.50);
gadget2.setType("Tablet");
gadgets[1] = gadget2;

for (int i = 0; i < gadgets.length; i++) {
System.out.println("Gadget======== " + (i + 1));
System.out.println("Name: " + gadgets[i].getGadgetName());
System.out.println("Price: " + gadgets[i].getPrice());
System.out.println("Type: " + gadgets[i].getType());
}

System.out.println("Available Gadget Types:");
for (String type : Gadget12.getGadgetTypes()) {
System.out.println(type);
}
}
}
