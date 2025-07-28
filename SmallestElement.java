//homework
//2. Write a program to find smallest element in an array

class SmallestElement {
public static void main(String[] args) {
int[] small = {35, 14, 9, 17, 21};
int smallest = giveSmallestNumber(small);
System.out.println(smallest);
}

public static int giveSmallestNumber(int[] small) {
int smallest = small[0];
for (int j = 0; j < small.length; j++) {
if (small[j] < smallest) {
smallest = small[j];
}
}
return smallest;
}
}