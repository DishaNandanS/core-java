// 1 3 5 7
// 1 3 5 7

class Pattern5 {
public static void main(String[] args) {

int rows = 2;
int columns = 4;

for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print(2 * j + 1);
}
System.out.println("");
}
}
}