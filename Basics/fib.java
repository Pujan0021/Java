
import java.util.Scanner;

public class fib {

    public static void main(String[] args) {
        int firstElement = 0;
        int secondElement = 1;
        int fib = 0;
        System.out.print("Enter a number you want to get its Fibonacci  :");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        for (int i = 1; i < number; i++) {
            fib = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = fib;

        }
        System.out.println("The fib of entered number is " + fib);

        num.close();
    }

}
