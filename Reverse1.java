package scanner;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a = 123;
		int reverse = 0;
		
		//for (int x = 0; a != 0; a /= 10) {//123 % 10 = 3, 
			//int digit = a % 10; 
			//reverse = reverse * 10 + digit; 
		for (int n = 123; n != 0; n /= 10) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
		}

			//while (a != 0) {
			//	int digit = a % 10;
			//	reverse = reverse * 10 + digit;
			//	a /= 10;
			//}
		//}
			System.out.print(reverse);
			//% 10 → gets last digits
			// 10 → removes last digit
		}
	}
