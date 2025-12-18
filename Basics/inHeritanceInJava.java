
class Animal {

    void barks() {
        System.out.println("Animal barks");
    }

    void eats() {
        System.out.println("Animal eats");
    }
}

class Cat extends Animal {

    void barks() {
        System.out.println("Cat meows instead of barking");
    }
}

public class InheritanceInJava {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.barks();
        c1.eats();
    }
}
