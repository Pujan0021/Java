
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HandleActionEvent extends JFrame implements ActionListener {

    JTextField text;
    JTextField text2;
    JTextField text3;
    JButton button;
    JButton button2;

    public HandleActionEvent() {
        setTitle("Handling Action Event");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel first = new JLabel("First Value :");
        first.setBounds(30, 30, 100, 20);
        add(first);

        text = new JTextField();
        text.setBounds(140, 30, 100, 20);
        add(text);

        JLabel second = new JLabel("Second Value :");
        second.setBounds(30, 60, 100, 20);
        add(second);

        text2 = new JTextField();
        text2.setBounds(140, 60, 100, 20);
        add(text2);

        JLabel result = new JLabel("Result :");
        result.setBounds(30, 90, 100, 20);
        add(result);

        text3 = new JTextField();
        text3.setBounds(140, 90, 100, 20);

        add(text3);

        button = new JButton("Add");
        button.setBounds(30, 120, 80, 20);
        add(button);
        button.addActionListener(this);

        button2 = new JButton("Subtract");
        button2.setBounds(120, 120, 100, 20);
        add(button2);
        button2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        int x = Integer.parseInt(text.getText());
        int y = Integer.parseInt(text2.getText());
        int z = 0;

        if (ae.getSource() == button) {
            z = x + y;
        } else if (ae.getSource() == button2) {
            z = x - y;
        }

        text3.setText(String.valueOf(z));

    }

    public static void main(String[] args) {
        new HandleActionEvent();
    }
}
