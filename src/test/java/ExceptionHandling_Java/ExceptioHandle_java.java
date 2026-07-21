package ExceptionHandling_Java;

public class ExceptioHandle_java {

    static  void subraction(int a, int b){
        try {
            int c = a / b;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("The code can be executed");
        }

    }


    public static void main(String[] args) {
        subraction(1,0);

    }

}
