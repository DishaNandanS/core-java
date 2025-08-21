//homework-19/08/25
//1.Write a program find factorial for a given number
//Example
//given number - 5 result = 120
//i.e 5 = 5*4*3*2*1 = 120
//3 = 3*2*1=6
//4 = 4*3*2*1=24
package xworkz;

public class Program2 {

	public static void main(String[] args) {
		int num = 4;
		int factorial = 1;
		
		for (int i = num; i>=1; i--) {// decrement y means where in num u had selected 4 so it considers:- 4->3->2->1..
			//till 1 it stops bcoz factorial value is 1 (where 0 we make everthing 0)
			factorial =factorial * i;
		}
		System.out.println("Factorial is" + factorial);
		}

}
