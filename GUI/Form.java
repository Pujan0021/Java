
import javax.swing.*;

public class Form {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Students Details");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel name = new JLabel("Name :");
        name.setBounds(30, 20, 80, 20);
        name.setVisible(true);
        name.setLayout(null);
        frame.add(name);

        JTextField textfield = new JTextField();
        textfield.setBounds(120, 20, 140, 20);
        frame.add(textfield);

        JLabel age = new JLabel("Age :");
        age.setBounds(30, 60, 100, 20);
        age.setVisible(true);
        age.setLayout(null);
        frame.add(age);

        JComboBox combo = new JComboBox<>();
        combo.setBounds(120, 60, 140, 20);
        combo.addItem(22);
        combo.addItem(21);
        combo.addItem(20);
        combo.addItem(19);
        combo.addItem(18);
        combo.addItem(17);
        combo.addItem(16);
        combo.addItem(15);
        combo.addItem(14);
        frame.add(combo);

        JLabel gender = new JLabel("Gender :");
        gender.setBounds(30, 100, 100, 20);
        frame.add(gender);

        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(120, 100, 60, 20);
        frame.add(radio1);

        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(180, 100, 80, 20);
        frame.add(radio2);

        JLabel hobbies = new JLabel("Hobbies :");
        hobbies.setBounds(30, 140, 100, 20);
        frame.add(hobbies);

        JCheckBox check1 = new JCheckBox("Playing");
        check1.setBounds(120, 140, 80, 20);
        frame.add(check1);
        JCheckBox check2 = new JCheckBox("Singing");
        check2.setBounds(220, 140, 80, 20);
        frame.add(check2);

        JCheckBox check3 = new JCheckBox("Swimming");
        check3.setBounds(320, 140, 100, 20);
        frame.add(check3);

        JLabel countries = new JLabel("Countires :");
        countries.setBounds(30, 180, 100, 20);
        frame.add(countries);

        JComboBox combo1 = new JComboBox<>();
        combo1.setBounds(120, 180, 140, 20);
        combo1.addItem("Nepal");
        combo1.addItem("Finland");
        combo1.addItem("Korea");
        combo1.addItem("France");
        frame.add(combo1);

        JLabel comments = new JLabel("Comments :");
        comments.setBounds(30, 220, 100, 20);
        frame.add(comments);

        JTextArea textarea = new JTextArea();
        textarea.setBounds(120, 220, 160, 60);
        frame.add(textarea);

        JButton submit = new JButton("Submit");
        submit.setBounds(120, 300, 80, 30);
        frame.add(submit);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(210, 300, 80, 30);
        frame.add(cancel);

    }
}
