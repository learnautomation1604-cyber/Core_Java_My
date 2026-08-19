package CoreJava.AccessModifiers;
// Java Does not provide a built in copy constructor , but you can create
// Copy Constructor - Its a constructor used to initialize one object with the data of another object of the same class

class student123{

    int age;


    // Normal Constructor
    student123(int age){
        this.age=age;

    }
    // Copy constructor

    student123(student123 obj){
        this.age = obj.age;

    }


    public static void main(String[] args) {
        student123 obj = new student123(5);
        student123 obj2 = new student123(obj);
        System.out.println(obj.age);
        System.out.println(obj2.age);

    }
}