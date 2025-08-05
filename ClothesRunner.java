class ClothesRunner {
public static void main(String[] args) {

Clothes[] clothes = new Clothes[4];

Clothes c1 = new Clothes();
c1.setType("T-Shirt");
c1.setBrand("Nike");
c1.setPrice(1500);

Clothes c2 = new Clothes();
c2.setType("Jeans");
c2.setBrand("Levis");
c2.setPrice(2500);

Clothes c3 = new Clothes();
c3.setType("Jacket");
c3.setBrand("Adidas");
c3.setPrice(3500);

Clothes c4 = new Clothes();
c4.setType("Sweater");
c4.setBrand("Puma");
c4.setPrice(1800);

for (int i = 0; i < clothes.length; i++) {
if (i == 0) {
clothes[i] = c1;
} else if (i == 1) {
clothes[i] = c2;
} else if (i == 2) {
clothes[i] = c3;
} else if (i == 3) {
clothes[i] = c4;
}
}

for (int i = 0; i < clothes.length; i++) {
Clothes c = clothes[i];
if (c != null) {
System.out.println(c.getType());
System.out.println(c.getBrand());
System.out.println(c.getPrice());
}
}
}
}
