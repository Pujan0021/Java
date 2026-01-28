
import javax.swing.*;

public class MenuBar {

    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Examples");
        f.setVisible(true);
        f.setSize(300, 300);
        JMenuBar menu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        menu.add(mFile);
        JMenu mEdit = new JMenu("Edit");
        menu.add(mEdit);
        f.setJMenuBar(menu);
        JMenuItem mOpen = new JMenuItem("Open");
        mFile.add(mOpen);
        JMenuItem mOpenProject = new JMenuItem("Open Project From File");
        mFile.add(mOpenProject);

    }
}
