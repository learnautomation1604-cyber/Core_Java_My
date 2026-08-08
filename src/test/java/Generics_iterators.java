import com.sun.tools.jconsole.JConsoleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Generics_iterators {

    // Generics allow you to write classes ,
    // interfaces and methods that work with different data type
    // s wile providing Compile time type safety errors .
    // They help eliminate explicit type casting and reduce run time error

    // Use of Generics - Type safety , Reusable code, No explicit type casting , Better readability and maintainability


    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("a");
//        list.add("b");
//        System.out.println(list);

        // Iterator - Is an interface used to treverse elements of a collection one by one. It is available in the java.util package
        // Methods used in iterator - hasNext(), next(), remove()

        String fruits[] = {"Orange", "Mango","Pine", "Mango", "Grape"};

        Set et = new HashSet();

        for(int i=0; i<fruits.length;i++){
//            System.out.println(fruits[i]);
            et.add(fruits[i]);

        }

        System.out.println("fruite: "+et);



        ArrayList<String> al = new ArrayList<>();
//        al.add("Manoj");
//        al.add("Manoj1");
//        al.add("Manoj2");
        System.out.println(al);

        Iterator<String> it = al.iterator();


        while (it.hasNext()) {
            String s = it.next();

            if(s == "Manoj1"){
                it.remove();
            }

            // has Next() - Returns true if another element exists
            //next() - Returns the next element
            // remove() -Remove the current element from the collections
        }

        System.out.println(al);







    }
}
