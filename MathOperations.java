package scanner;
import java.util.Scanner;//remember

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number");
        int num1 = sc.nextInt();

        System.out.print("Enter second number");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;
        System.out.println("Addition:" + sum);
        System.out.println("Subtraction:" + diff);
        System.out.println("Multiplication:" + product);
        System.out.println("Division:" + division);
        System.out.println("Modulus:" + modulus);

        sc.close();//remember this
    }
}
