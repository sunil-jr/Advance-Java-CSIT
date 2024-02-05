package swing.layoutmanagement;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        setTitle("Flow Layout");
        setSize(300, 300);

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        JButton b6 = new JButton("B6");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        setLayout(new GridLayout(2,3));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
