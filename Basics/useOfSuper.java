
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
    String company = "KTM";

    String company() {
        System.out.println("Company of motorBike:");
        return company;
    }

    float mileage() {
        System.out.println("Mileage of Duke:");
        return mileage;

    }

    String speed() {
        System.out.println("Speed of motorBike:");

        return super.speed;
    }

}

public class useOfSuper {

    public static void main(String[] args) {
        // motorBike m1 = new motorBike();
        // System.out.println("Company:" + m1.specs());
        duke d1 = new duke();
        System.out.println("Company:" + d1.company());
        System.out.println("Mileage:" + d1.mileage());
        System.out.println("Speed:" + d1.speed());

    }
}
