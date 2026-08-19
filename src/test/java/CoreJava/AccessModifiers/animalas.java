package CoreJava.AccessModifiers;
// Super keyword - The super keyword in Core Java refer to the immediate parent class Object. It is mainly used in the inheritance

    class animalas{

        String colour = "White";

        void colour(){

        }

        animalas(){

        }


    }

    class Dogdfgdgd extends animalas{
        String colour = "Black";

        void printcolour(){
            System.out.println(colour);
            System.out.println(super.colour);
        }
        void method(){
            super.colour();

        }

        Dogdfgdgd(){
            super();// this can by calls the parent constructor


        }

        static void main() {
            Dog d = new Dog();

        }


    }




























