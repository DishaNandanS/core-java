package scanner;
//2.Write a program to find palindrome MAM = MAM
public class Palindrome {
    public static void main(String[] args) {
        String str = "MAM";         
        String reversed = "";      

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);// remember
        }
        if (str.equals(reversed)) {
            System.out.println("it is palindrome:" + str);
        } else {
            System.out.println("is NOT a palindrome: " + str);
        }
    }
}

