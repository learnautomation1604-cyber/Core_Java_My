public class wrapperclass {

    // Wrapper class is a class that wraps a primitive data type in to an object

//    | Primitive Type | Wrapper Class |
//            | -------------- | ------------- |
//            | byte           | `Byte`        |
//            | short          | `Short`       |
//            | int            | `Integer`     |
//            | long           | `Long`        |
//            | float          | `Float`       |
//            | double         | `Double`      |
//            | char           | `Character`   |
//            | boolean        | `Boolean`     |


    static void main(String[] args) {

        int num = 10;
        // (Autoboxing -> primitive to object)
        Integer obj = num;
        //(Unboxing -> object to primitive)

        int valu = obj;
        System.out.println(num);





    }

}
