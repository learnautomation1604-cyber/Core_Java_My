enum Env{

//    Monday,
//    Tuesday,
//    Wednesday,
//    Thursday,
//    Friday,
    dev,
    sit,
    QA,
    uat,
    prod

}

// Fixed set of constant can be declared as enum
// Collection of predefined value


public class enuam_test {



    public static void main(String[] args) {

        Env D = Env.dev;


        switch (D){
            case dev:
                System.out.println("Monday");
                break;

        }





    }
}