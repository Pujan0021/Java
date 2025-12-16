
class Box {

    int length, width, height;

    int volume() {
        return height * width * length;
    }

    void setData(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
}

public class calcVolume {

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        b1.setData(12, 3, 10);
        b2.setData(3, 3, 2);
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());

    }
}
