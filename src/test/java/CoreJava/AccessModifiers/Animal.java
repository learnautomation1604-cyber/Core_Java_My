package CoreJava.AccessModifiers;

class Animal {
    protected void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    public void bark() {
        sound(); // Accessible
    }
}