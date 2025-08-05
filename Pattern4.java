// 2 4 6 8
// 2 4 6 8

class Pattern4 {
public static void main(String[] args) {

int rows = 2;
int columns = 4;

for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= columns; j++) {
System.out.print(2 * j);
}
System.out.println("");
}
}
}