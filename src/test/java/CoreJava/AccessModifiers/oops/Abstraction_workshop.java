package CoreJava.AccessModifiers.oops;
// Abstraction - Hiding the implementation Details


// Using Abstract class:

//public class Abstraction_workshop {
//
//    static abstract class vehicle{
//        abstract void start();
//    }
//
//     static class BIKE extends vehicle{
//
//        @Override
//         void start(){
//            System.out.println("Bike Started With Key");
//        }
//
//    }
//    public static void main(String[] args) {
//
//        honda obj = new honda();
//        obj.start();
//
//    }
//
//}


// Interface - An interface in java is a blueprint of a class that contains method, declarations which implementing classes must define

interface Animal{
    void sound();
}

class Cat implements Animal{
    public void sound(){
        System.out.println("cat");
    }
}