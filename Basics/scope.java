
public class scope {

    public static void main(String[] args) {
        int x;
        x = 20;
        if (x == 20) {
            int y;
            y = 10;
            int z = x * y;
            System.out.println("The product of x*y= " + z);
        }
        // int z = x * y; Here y and z are block level element / local variable
        // System.out.println("The product of x*y= " + z); // Throws an error

    }
}
