
class Rectangle {

    int length, breadth;

    int area() {
        return length * breadth;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

public class calcArea {

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(10, 10);
        System.out.println("Area: " + R1.area());
    }
}
