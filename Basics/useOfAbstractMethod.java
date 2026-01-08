
abstract class Animal {

    abstract void makesSound();

}

class Dog extends Animal {

    void makesSound() {
        System.out.println("BHauuuuuuuuuuuuuuuuuuuuu!");
    }

}

class Cat extends Animal {

    void makesSound() {
        System.out.println("Meow Meowwwwwwwwwwwwwww!");
    }
}

public class useOfAbstractMethod {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        d1.makesSound();
        c1.makesSound();
    }
}
