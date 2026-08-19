package CoreJava.AccessModifiers.Collections_Java.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {

    static void set_Pract(){

        // set - Interface
        // Stores unique values
        // Unlike a list, set doenot allows duplicate values

    }



   static void hashset(){
        Set<String> names = new HashSet<>();
        names.add("Pear");
        names.add("Orange");
        names.add("Orange");
        System.out.println(names); // it wont allow any duplicates
        names.add("Mango");
        System.out.println(names);
        names.add("Jackfruit");
       System.out.println(names); // Insertion order canot followed, Sort not followed, No thread safety

    }


    static void linkedhashset(){
        Set<String> nameslinkhs = new LinkedHashSet<>();
        nameslinkhs.add("Pear");
        nameslinkhs.add("Orange");
        nameslinkhs.add("Mango");
        nameslinkhs.add("Jackfruit");
        nameslinkhs.add("pineapple");
        System.out.println(nameslinkhs);

    }



    public static void main(String[] args){
        hashset();
        linkedhashset();



    }








}
