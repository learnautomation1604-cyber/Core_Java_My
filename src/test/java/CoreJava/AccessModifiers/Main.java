package CoreJava.AccessModifiers;

class Employee {

    private int salary = 50000;

    void display() {
        System.out.println(salary);
    }

     static class Employee2{

        void method(){

        }


    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // System.out.println(emp.salary); // Error
        emp.display();

        Employee.Employee2 obj= new Employee.Employee2();
        obj.method();
    }
}