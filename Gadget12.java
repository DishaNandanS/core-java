class Gadget12 {
private String gadgetName;
private double price;
private String type;

static String[] gadgetTypes = {"Smartphone", "Tablet", "Laptop", "Smartwatch"};

public static String[] getGadgetTypes() {
return gadgetTypes;
}

public void setGadgetName(String gadgetName) {
this.gadgetName = gadgetName;
}

public String getGadgetName() {
return gadgetName;
}

public void setPrice(double price) {
this.price = price;
}

public double getPrice() {
return price;
}

public void setType(String type) {
this.type = type;
}

public String getType() {
return type;
}
}
