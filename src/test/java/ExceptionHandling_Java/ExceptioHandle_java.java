package ExceptionHandling_Java;

public class ExceptioHandle_java {

    static  void subraction(int a, int b) {
        try {
            int c = a / b;

            throw new IllegalAccessException("Not eligible to get the value");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Program Executed");
        }

    }


    public static void main(String[] args) {
        subraction(1,0);

    }

}
