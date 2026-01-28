
import java.awt.FlowLayout;
import javax.swing.*;

public class LayOuts {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        JButton btn1 = new JButton("Button");
        f.add(btn1);
        JButton btn2 = new JButton("Button");
        f.add(btn2);
        JButton btn3 = new JButton("Button");
        f.add(btn3);
        JButton btn4 = new JButton("Button");
        f.add(btn4);
        JButton btn5 = new JButton("Button");
        f.add(btn5);
        JButton btn6 = new JButton("Button");
        f.add(btn6);
    }
}
