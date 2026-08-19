package CoreJava.AccessModifiers;

public class DefaultAccess {
    String name = "Saravanan"; // default access

    void add(){


    }
}
class Test123 {
    public static void main(String[] args) {
        DefaultAccess s = new DefaultAccess();
        System.out.println(s.name);
        s.add();
    }
}
