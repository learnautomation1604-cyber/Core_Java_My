public class typecasting_demo {
    // Type casting is the process of converting a vale from one data type to another
//Implicit typecasting (Widening casting)

    // Done Automatically by java
    // Converts smaller data type to a larger data type
    // No data loss occur


    // byte - short (char - int) - int - float - double


// Explicit typecasting (Narrow casting)
    // Done manually by the programmer
    // convert large data type in to smaller data type
    // May result in data loss or overflow


    public static void main(String[] args){

//Implicit typecasting (Widening casting) - int -> long, float -> double

        int num = 100;
        System.out.println(num);
        double value = num;
        System.out.println("Value is: " + value);

// Explicit typecasting (Narrow casting)  double -> int, long -> int, int -> byte

        double dtytr = 80000.99999999;
        System.out.println(dtytr);
        int num1 = (int) dtytr;
        System.out.println(num1);

    }
}
