
class motorBike {

    float mileage = 40.44f;
    String speed = "500k/h";
    String company = "KTM";

    void specs() {
        System.out.println("-----------Motor Bike Specs-----");
    }

}

class duke extends motorBike {

    float mileage = 20.44f;
    String speed = "300k/h";
    String name = "KTM390 Adventure";

    void display() {
        super.specs();
    }

    String company() {
        System.out.println("Company of motorBike: " + company);
        return company;
    }

    float mileage() {
        System.out.println("Mileage of Duke: " + mileage);
        return mileage;

    }

    String speed() {
        System.out.println("Speed of motorBike:   " + super.speed);

        return super.speed;
    }

}

public class useOfSuper {

    public static void main(String[] args) {
        // motorBike m1 = new motorBike();
        // System.out.println("Company:" + m1.specs());
        duke d1 = new duke();
        d1.display();
        d1.company();
        d1.mileage();
        d1.speed();

    }
}
