
public class sumOfTenNumbers {

    public static void main(String[] args) {
        int arr[];
        arr = new int[12];
        // int arr[] = {10, 20, 30, 40, 50, 39, 30, 20};
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;
        arr[5] = 10;
        arr[6] = 10;
        arr[7] = 10;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            average = sum / arr.length;
        }
        System.out.println("The total sum is :" + sum);
        System.out.println("The average sum is :" + average);
        System.out.println("The array length is :" + arr.length);
    }
}
