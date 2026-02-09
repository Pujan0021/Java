
class thread extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {
            int b = 0;

            System.out.println(b + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class CreatingThread {

    public static void main(String[] args) {
        thread show = new thread();
        show.start();
    }
}
