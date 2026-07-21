package String;

import org.openqa.selenium.devtools.v146.dom.model.ShapeOutsideInfo;

public class stringpractice {

    static void stringbasic(){
        // A string is a sequence of charecters used to store text
        String name = "Mythili";
        System.out.println(name);
        String str = new String("Mythili");
        System.out.println(str);
    }

    static void concater(){
        String s = "Java ";
        String m = s.concat("Programming");
        System.out.println(m);
    }
    static void lenthero(){
        String s = "Java";
        System.out.println(s.length());
    }
    static void charat() {
        String st = "Anbarasu A";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            System.out.println(ch);
        }
    }
    static void stringcompare(){
        String str = "java";
        String st = "jav";

        String result = String.valueOf((str==st));
        String eq = String.valueOf(str.equals(st));
        System.out.println(eq);
        System.out.println(result);
    }

    static void java_equals(){
        String str = "java";
        String st = "jav";

        boolean result = str.equals(st);
        System.out.println(result);
    }

    static void substring_java(){
        String str = "java";
        System.out.println(str.substring(1));
    }

    static void java_replace(){
        String str = "java";
        System.out.println(str.replace("a", "k"));

    }

    static void upperandlowercase(){
        String str = "java";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
    static void contains_java(){

        String str = "java programming";
        System.out.println(str.contains("java"));
        System.out.println(str.contains("ja"));
        System.out.println(str.contains("zep"));

    }


    public static void main(String[] args) {
//        stringbasic();
//        concater();
//        lenthero();
//        charat();
//        stringcompare();
//        java_equals();
//        substring_java();
//        java_replace();
//        upperandlowercase();
        contains_java();



    }
}
