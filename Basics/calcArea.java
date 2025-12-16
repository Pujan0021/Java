
class Rectangle {

    int length, breadth;

    int computeArea() {
        int area = length * breadth;
        return area;
    }

    void displayArea() {
        System.out.println("The area  is :   " + computeArea());
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

public class calcArea {

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(300, 10);
        Rectangle R2 = new Rectangle(100, 20);
        R1.displayArea();
        R2.displayArea();
        int areaOfR1 = R1.computeArea();
        int areaOfR2 = R2.computeArea();

        if (areaOfR1 > areaOfR2) {
            System.out.println("The area of R1 is greater than R2. Area of R1: " + areaOfR1);
        } else {
            System.out.println("The area of R2 is greater than R1. Area of R2: " + areaOfR2);
        }
    }
}
