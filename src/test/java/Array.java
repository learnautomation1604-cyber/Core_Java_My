public class Array {

    public static void main(String[] args) {

        // Declaring an array

        int[] num11;
        int[] num12;

        String[] str11;
        double[] num22 ;

        // Creating an array
        int[] num = {1,2,5,6,8,90};
//        int[] num1 = {1,2,5,6,8,9};
//
//        String[] str = {"a","b","c","d","e","f","g"};
//        double[] num2 = {1,2,5,6,8,9};
        // Initialize the array

        System.out.println(num[3]);


        // Accessing array element
        System.out.println(num[3]);

        // Updating array element
        // Finding array length

        System.out.println("length of the array: "+num.length);
        // Treversing an array using for loop - Trevering means accessing the data one by one

        for(int i=0; i<num.length;i++){

            System.out.println("Treversed data output from num[] input: "+num[i]);

        }

        // Treversing an array using enhanced for-each loop

        int sum=0;

        int max = num[0];

        for(int n : num){
            System.out.println("for-eac output: "+n);
            // Sum of array Element
            sum += n; // sum = n+sum
            System.out.println("Addition Output: "+sum);
            // Finding maximum element

            if(n>max){
                max = n;
            }
            //

        }
        System.out.println("mAX : " +max);

        // Two - Dimentinal Array

        int[][] num123 = {{1,2,3}, {5,6,7}};

        System.out.println(num123[1][1]);
        System.out.println(num123[1][1]);



    }
}
