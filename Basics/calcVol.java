
class Box {

    int length, width, height;

    int volume() {
        return length * width * height;
    }

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }//Parametirized Constructor
}

public class calcVol {

    public static void main(String[] args) {
        Box b1 = new Box(3, 5, 6);
        Box b2 = new Box(4, 7, 8);
        System.out.println("Box 1 Volume:" + b1.volume());
        System.out.println("Box 2 Volume:" + b2.volume());
    }
}
