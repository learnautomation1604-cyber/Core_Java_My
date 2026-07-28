package Collections_Java.list;

import java.util.*;

public class Arraylist_demo {

    public static void main(String[] args) {

        // Array list - Most commonly used collection is array list
        // Duplicates - yes | Order  - Yes     | Sorted - No | Thread Safe - No |

        ArrayList list1 = new ArrayList();
        // List<String> list1 = new ArrayList<>();
         list1.add("Apple");
        list1.add("Banana");
        list1.add("Pear");
        list1.add("Orange");
        list1.add("Apple");
        list1.add(" ");
        list1.add(" ");
        Collections.sort(list1);
        System.out.println(list1);


        // Linked List :

        LinkedList list2 = new LinkedList();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Pear");
        list2.add("Orange");
        list2.add("");
        System.out.println(list2);
       // System.out.println(list2.get(2));


    }
}
