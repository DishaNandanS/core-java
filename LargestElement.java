//homework
//1. Write a program to find largest element in an array  

class LargestElement {
public static void main(String[] args) {
int[] num = {89, 99, 49, 56, 77};
int largest = findLargestNumber(num);
System.out.println(largest);
}
public static int findLargestNumber(int[] num) {
	int largest = num[0];///num[0]
for (int i = 0; i < num.length; i++) {
if (num[i] < largest) {	

largest = num[i];
}
}
return largest;
}
}

