
abstract class Animal {

    abstract void makesSound();
}

class Cat extends Animal {

    void makesSound() {
        System.out.println("Meow Meow");
    }
}

public class meow {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makesSound();
    }
}
