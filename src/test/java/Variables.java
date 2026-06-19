// Define Variables - In Java, a Variable is a named storage location used to hold data that can be used and modified during execution
// Types of variables - Local Variable, Instance Variable, Static Variable

// 1. Local Variable - Declare inside the method or block
// Declare Inside a method , constructor, block
// Accessible only with in that block
// Must be initialized before use


class demo{

    void method(){
        int a =10;
    }



    public static void main(String[] args) {
        
        int a =10;

        int c = a+3;
        System.out.println(a);

    }

}

// 2. Instance Variable - Declared inside a class but outside the method


class iv{

    String name;// Instance variable

    iv(){
        
    }

    void method1(){

    }

}


// 3. Static Variable - Shared by all objects of the class, Declare using static keyword

class student{

    static int count =0;

    student(){ // Constructor

        count++;
    }


}

class main{

    public static void main(String[] args) {

        new student();
        new student();
        new student();
        new student();

        System.out.println(student.count);
        


    }


}




