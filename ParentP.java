package methodOverloading;

public class ParentP {

	String name;
    final int code;

    public ParentP(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public final void show(String msg) {
        System.out.println("ParentP Final method with String: " + msg);
    }

    public final void show(int num) {
        System.out.println("ParentP Final method with int: " + num);
    }

    public static void display(String text) {
        System.out.println("ParentP static method with String: " + text);
    }

    public static void display(int value) {
        System.out.println("ParentP static method with int: " + value);
    }

    public void details() {
        System.out.println("ParentP Name: " + name + ", Code: " + code);
    }
}
