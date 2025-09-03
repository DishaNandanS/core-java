package defaultFinalChecking;
//Assignment:-Create inheritance programand check can you override
//final ,static, private , protected, default method


public class Parent1 {
//single level inheritance
	public String familyName= "Singh";       
    protected int age =105;                   
    String location ="New York";             
    private double wealth=100000.50;
    public final String bloodGroup ="O+";
    
    public void publicMethod() {
        System.out.println("public method.");
    }

    protected void protectedMethod() {
        System.out.println("protected method.");
    }

    void defaultMethod() {
        System.out.println("default method.");
    }

    private void privateMethod() {
        System.out.println("private method.");
    }

    public final void finalMethod() {
        System.out.println("final method .");
    }

    public static void staticMethod() {
        System.out.println("static method.");
    }

    public void showParentInfo() {
        System.out.println("Family Name:" + familyName);
        System.out.println("Age:" + age);
        System.out.println("Location:" + location);
        System.out.println("Wealth:" + wealth);
        System.out.println("Blood Group:" + bloodGroup);

        privateMethod(); //only accessible inside Parent1
    }
}
