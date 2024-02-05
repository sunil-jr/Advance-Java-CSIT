package swing.guicontrols;

import javax.swing.*;
import java.awt.*;

public class ComboBoxExample extends JFrame {

    //initializing array of strings since one of the JcomboBox constructors takes String array as parameter
    String[] dropdown = {"sunil","samir","rustam","bipin"};
    public ComboBoxExample(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JComboBox box = new JComboBox(dropdown);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(box);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
