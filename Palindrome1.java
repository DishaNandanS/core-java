package scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        String str = "MADAM";         
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
