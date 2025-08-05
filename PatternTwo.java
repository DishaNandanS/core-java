// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
   
// 4 3 2 1   
// 4 3 2 1
   
// 2 4 6 8
// 2 4 6 8

// 1 3 5 7
// 1 3 5 7   
class PatternTwo {
public static void main(String[] args) {

int rows = 3;
int columns = 4;

for (int i = 0; i < rows; i++) { //Each iteration prints one full row
for (int j = 0; j < columns; j++) {

System.out.print(j + 1);
}
System.out.println("");
}
}
}
