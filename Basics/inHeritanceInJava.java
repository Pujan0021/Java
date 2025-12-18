
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
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {

    void barks() {
        System.out.println("Cow moos");
    }
}

public class inHeritanceInJava {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cow cow1 = new Cow();
        cat1.barks();
        cat1.eats();
        cow1.barks();
        cow1.eats();
    }
}
