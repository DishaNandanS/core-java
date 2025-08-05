class FruitsRunner {
public static void main(String[] args) {

Fruits[] fruits = new Fruits[4];

Fruits fruits1 = new Fruits();
fruits1.setName("Mango");
fruits1.setNoOfFruits(700);
fruits1.setColor("Yellow");

Fruits fruits2 = new Fruits();
fruits2.setName("Apple");
fruits2.setNoOfFruits(900);
fruits2.setColor("red");

Fruits fruits3 = new Fruits();
fruits3.setName("grapes");
fruits3.setNoOfFruits(500);
fruits3.setColor("purple");

Fruits fruits4 = new Fruits();
fruits4.setName("Lichai");
fruits4.setNoOfFruits(100);
fruits4.setColor("White");

for (int i = 0; i < fruits.length; i++) {
if (i == 0) {
fruits[i] = fruits1;
} else if (i == 1) {
fruits[i] = fruits2;
} else if (i == 2) {
fruits[i] = fruits3;
} else if (i == 3) {
fruits[i] = fruits4;
}
}

for (int i = 0; i < fruits.length; i++) {
	Fruits fruit = fruits[i];
if (fruit != null) {
System.out.println(fruit.getName());
System.out.println(fruit.getNoOfFruits());
System.out.println(fruit.getColor());
}
}
}
} 













