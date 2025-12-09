
public class light {

    public static void main(String[] args) {
        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.println("In 100 days light will travel about " + distance
                + " miles");
    }
}
