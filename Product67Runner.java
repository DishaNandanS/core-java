class Product67Runner {
public static void main(String[] args) {
Product67[] products = new Product67[2];

Product67 product1 = new Product67();
product1.setProductName("Laptop");
product1.setProductPrice(69999.99);
product1.setBrand("Dell");
products[0] = product1;

Product67 product2 = new Product67();
product2.setProductName("Smartphone");
product2.setProductPrice(24999.49);
product2.setBrand("Samsung");
products[1] = product2;

for (int i = 0; i < products.length; i++) {
System.out.println("Product======== " + (i + 1));
System.out.println("Name: " + products[i].getProductName());
System.out.println("Price: " + products[i].getProductPrice());
System.out.println("Brand: " + products[i].getBrand());
}

System.out.println("Available Product Categories:");
for (String category : Product67.getProductCategories()) {
System.out.println(category);
}
}
}
