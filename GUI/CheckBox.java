
import javax.swing.*;

public class CheckBox {

    public static void main(String[] args) {
        JFrame jf = new JFrame("CheckBox");
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);

        JLabel l = new JLabel("Course:");
        l.setLayout(null);
        l.setVisible(true);
        l.setBounds(30, 30, 80, 20);
        jf.add(l);

        JCheckBox jc = new JCheckBox("CSIT", true);
        jc.setLayout(null);
        jc.setVisible(true);
        jc.setBounds(120, 30, 150, 20);
        jf.add(jc);

        JCheckBox jc2 = new JCheckBox("BCA", true);
        jc2.setLayout(null);
        jc2.setVisible(true);
        jc2.setBounds(120, 60, 150, 20);
        jf.add(jc2);
        JCheckBox jc3 = new JCheckBox("BTEC", false);
        jc3.setLayout(null);
        jc3.setVisible(true);
        jc3.setBounds(120, 90, 150, 20);
        jf.add(jc3);

        JRadioButton jr = new JRadioButton("BIT", false);
        jr.setLayout(null);
        jr.setVisible(true);
        jr.setBounds(120, 120, 180, 20);
        jf.add(jr);
    }
}
