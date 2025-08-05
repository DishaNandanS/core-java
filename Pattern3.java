// 4 3 2 1   
// 4 3 2 1

class Pattern3 {
public static void main(String[] args) {

int rows = 2;
int columns = 4;

for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
System.out.print(4 - j);
}
System.out.println("");
}
}
}