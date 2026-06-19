// Rule 1 - You can create mutiple class in the maven file
// Rule 2 - You can create one main method inside the class
// Rule 3 - You can create Main method ouside of the classes too
// Rule 4 - User can create the nested classes with in single file
// Rule 5 - User can create n number of method inside the class which declared
// Rule 6 - You can create only one main method Inside the class which you created
// Rule 7 - If you want to access the one method from one class file to another class file - Instant need to be created
// Rule 8 - All the code should be endup with semicolon (Not class syntax or method sysntex)





class anbu{

    void method1(){
        System.out.println("I am from classname class method1");

    }
    void method12(){
        
      System.out.println("I am from classname class method12");
    }

    public static void main(String[] args) {

        anbu Onj = new anbu();
        Onj.method1();

        
        
    }

}

class classname1{

    public static void main(String[] args) {
        anbu an = new anbu();
        an.method1();
        
    }

}





