package CoreJava.AccessModifiers.oops;

public class Inheritance_oops {


    static class Parent{

        void methomethdparent(){
            System.out.println("Hey i am the method from Parent class");
        }
    }

    static class cild extends Parent  {

        void methodchild(){
            System.out.println("Hey i am the method from Child class");
        }

    }


    public static void main(String[] args){
        cild cil = new cild();
        cil.methodchild();
        cil.methomethdparent();




    }





}
