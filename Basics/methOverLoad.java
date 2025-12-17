
class Addition {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(int a, double b) {
        return a + b;
    }
}

public class methOverLoad {

    public static void main(String[] args) {
        Addition s1 = new Addition();
        int sum1 = s1.sum(10, 20);
        Addition s2 = new Addition();
        int sum2 = s2.sum(10, 20, 30);
        Addition s3 = new Addition();
        double sum3 = s3.sum(2000, 30000.44);
        System.out.println("Sum1= " + sum1);
        System.out.println("Sum2= " + sum2);
        System.out.println("Sum3= " + sum3);
    }
}
