package CoreJava.AccessModifiers.ExceptionHandling_Java;

import java.io.FileNotFoundException;

import static java.lang.Class.forName;

public class ClassNotfoundExceotion {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Class.forName("java.lang.strin");
        System.out.println("Class found");



    }



}
