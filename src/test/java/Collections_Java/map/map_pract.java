package Collections_Java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class map_pract {


    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<>();

        System.out.println(student);

        student.put( 1876, " anbu");
        System.out.println(student);
        student.put( 1878, " anbut");
        System.out.println(student);
        // put() to add the data
        // Update value
        student.put( 1878, "muthili");
        System.out.println(student);
        // Accessing value()
        System.out.println(student.get(1878));

        // iF WANT TO CHECK THE KEYS AND VALUES - Asserion

        System.out.println(student.containsKey(1878));
        System.out.println(student.containsValue("muthili"));

        // Remove the data pair from the map provided

        System.out.println(student.remove(1878, "muthili"));
        System.out.println(student.size());

        // Is Empty

        System.out.println(student.isEmpty());
        // Clear
        System.out.println(student);
        student.clear();
        System.out.println(student);
        Map<Integer, String> student1 = new LinkedHashMap<>();







    }
}
