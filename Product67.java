class Product67 {
private String productName;
private double productPrice;
private String brand;

static String[] productCategories = {"Electronics", "Clothing", "Grocery", "Appliances"};

public static String[] getProductCategories() {
return productCategories;
}

public void setProductName(String productName) {
this.productName = productName;
}

public String getProductName() {
return productName;
}

public void setProductPrice(double productPrice) {
this.productPrice = productPrice;
}

public double getProductPrice() {
return productPrice;
}

public void setBrand(String brand) {
this.brand = brand;
}

public String getBrand() {
return brand;
}
}
