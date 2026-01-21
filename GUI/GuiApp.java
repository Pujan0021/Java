
import java.awt.Color;
import javax.swing.*;

public class GuiApp {

    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame Example");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        JLabel l = new JLabel("Name: ");
        l.setSize(30, 30);
        l.setBounds(30, 40, 50, 50);
        l.setBackground(Color.BLACK);
        l.setVisible(true);
        l.setLayout(null);
        f.add(l);
    }
}
