package CoreJava.AccessModifiers;

 public class test {

     static void method1(){

     }

     public static void main(String[] args) {
         test3 Objectr = new test3();
         Objectr.method3();

     }


}




class test3{

     void method3(){

    }

    public static void main(String[] args) {
        test object = new test();
        test.method1();



    }


}
