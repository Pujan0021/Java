
import javax.swing.*;

public class GuiApp {

    public static void main(String[] args) {
        JFrame f = new JFrame("JFarame Examples");

        JLabel f1 = new JLabel("Name : ");
        f1.setBounds(10, 10, 50, 10);
        f.add(f1);

        JTextField jf = new JTextField();
        jf.setBounds(70, 10, 100, 20);
        f.add(jf);

        JLabel f2 = new JLabel("Address : ");
        f2.setBounds(10, 40, 50, 10);
        f.add(f2);

        JTextField jg = new JTextField();
        jg.setBounds(70, 40, 100, 20);
        f.add(jg);

        JButton jb = new JButton("Sumit");
        jb.setBounds(80, 70, 80, 20);
        f.add(jb);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
