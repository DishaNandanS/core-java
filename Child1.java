package defaultFinalChecking;

public class Child1 extends Parent1{

	public String givenName = "Nisarga";
	public void publicMethod() {
        System.out.println("public method.");
    }
	 protected void protectedMethod() {
	        System.out.println("overridden protected method.");
	    }
	 void defaultMethod() {
	        System.out.println("overridden default method");
	    }
	 public static void staticMethod() {
	        System.out.println("Static method");
	    }
	 public void showChildInfo() {
	        System.out.println("Family Name: " + familyName);
	        System.out.println("Given Name: " + givenName);
	        System.out.println("Age: " + age);
	        System.out.println("Location: " + location);
	        System.out.println("Blood Group: " + bloodGroup);// (final)
	    }
	}
