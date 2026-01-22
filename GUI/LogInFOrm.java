
import javax.swing.*;

public class LogInFOrm {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setSize(500, 250);
        fr.setLayout(null);
        fr.setVisible(true);

        JLabel lu = new JLabel("User Name: ");
        lu.setSize(40, 30);
        lu.setLayout(null);
        lu.setVisible(true);
        lu.setBounds(30, 40, 80, 20);
        fr.add(lu);

        JTextField lf = new JTextField();
        lf.setSize(60, 30);
        lf.setLayout(null);
        lf.setBounds(120, 40, 120, 20);
        lf.setVisible(true);
        fr.add(lf);

        JLabel lp = new JLabel("Password:");
        lp.setSize(40, 30);
        lp.setLayout(null);
        lp.setBounds(30, 70, 300, 20);
        lp.setVisible(true);
        fr.add(lp);

        JPasswordField lpa = new JPasswordField();
        lpa.setSize(60, 30);
        lpa.setLayout(null);
        lpa.setBounds(120, 70, 120, 20);
        lpa.setVisible(true);
        fr.add(lpa);

        JButton lb = new JButton("LogIn");
        lb.setSize(60, 30);
        lb.setLayout(null);
        lb.setBounds(30, 100, 100, 20);
        lb.setVisible(true);
        fr.add(lb);

        JButton lc = new JButton("Cancel");
        lc.setSize(60, 30);
        lc.setLayout(null);
        lc.setBounds(140, 100, 100, 20);
        lc.setVisible(true);
        fr.add(lc);
    }
}
