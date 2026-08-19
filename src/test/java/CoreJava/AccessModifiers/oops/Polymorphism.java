package CoreJava.AccessModifiers.oops;

public class Polymorphism {

    // Polymorphism it's a OOPS concept that allows One method or Object take many morphism
    // Types of polymorphism -
    // 1. Method Overlading or Compile time polymorphism or static polymorphism
    // 2. Method Overridding or Run time Polymorphism 0r Dynamic Plymorphism


   // Compile time Polymorphism - The Compiler decides which method to call based on the method signature

   // Rules - Same method name, Different Pararmeters

   void method(int x){
      System.out.println("Hey I am a void method with integer parameter"+x);
   }

   void method(String x){
      System.out.println("Hey I am a void method with string parameter"+x);

   }



   public static void main(String[] args){
      Polymorphism  p = new Polymorphism();
      p.method(3);
      p.method("dfdw");




   }








   }
