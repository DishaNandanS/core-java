package methodOverloading;

class ChildC extends ParentP {
    String project;

    public ChildC(String name, int code, String project) {
        super(name, code);
        this.project = project;
    }

    public static void display(String text) {
        System.out.println("ChildC static method with String: " + text);
    }

    @Override
    public void details() {
        System.out.println("ChildC Name: " + name + ", Project: " + project + ", Code: " + code);
    }
}
