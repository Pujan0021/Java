
import java.awt.event.*;
import javax.swing.*;

public class EventExample extends JFrame implements ActionListener {

    JTextField jt;

    EventExample() {
        setTitle("Event Example");
        setSize(400, 300);
        setLayout(null);

        JButton btn = new JButton("Click Me!");
        btn.setBounds(100, 100, 150, 20);
        add(btn);
        btn.addActionListener(this);

        jt = new JTextField();
        jt.setBounds(100, 60, 150, 20);
        add(jt);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        jt.setText("What's up");
    }

    public static void main(String[] args) {
        new EventExample();
    }
}
