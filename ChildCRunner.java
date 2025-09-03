package methodOverloading;

public class ChildCRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentP p = new ParentP("ParentClass", 101);
        ChildC c = new ChildC("ChildClass", 202, "AI Project");

        p.show("Hello World");
        p.show(123);

        ParentP.display("From ParentP");
        ParentP.display(10);
        ChildC.display("From ChildC");

        p.details();
        c.details();
    }
}
