package CoreJava.AccessModifiers;

public class publicaccessmodifier {

    public void add() {
        System.out.println(10 + 20);
    }
}
 class Test {
    public static void main(String[] args) {
        publicaccessmodifier c = new publicaccessmodifier();
        c.add();
    }
}


