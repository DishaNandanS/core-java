package defaultFinalChecking;

public class Parent1Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent1 parent = new Parent1();
        parent.showParentInfo();
        parent.publicMethod();
        parent.protectedMethod();
        parent.defaultMethod();
        parent.finalMethod();
        Parent1.staticMethod();
        
        Child1 child = new Child1();
        System.out.println("---------------------");
        child.showChildInfo();
        child.publicMethod();     
        child.protectedMethod();  
        child.defaultMethod();   
        child.finalMethod();      
        Child1.staticMethod(); 
	}

}
