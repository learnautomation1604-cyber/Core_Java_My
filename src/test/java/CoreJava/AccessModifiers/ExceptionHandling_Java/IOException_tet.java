package CoreJava.AccessModifiers.ExceptionHandling_Java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException_tet {


    public static void main(String[] args) throws FileNotFoundException {

            try{
                FileReader file = new FileReader("data.txt");
                System.out.println("FileOpenSuccessfully");

            }catch (FileNotFoundException e){
                System.out.println("FileOpenFailed");
            }

    }
}
