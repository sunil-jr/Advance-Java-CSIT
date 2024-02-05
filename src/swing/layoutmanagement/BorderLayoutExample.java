package swing.layoutmanagement;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {

    //JFrame Creation using object showing the border layout example

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton b1 = new JButton("EAST");
        JButton b2 = new JButton("WEST");
        JButton b3 = new JButton("NORTH");
        JButton b4 = new JButton("SOUTH");
        JButton b5 = new JButton("CENTER");

        frame.add(b1, BorderLayout.EAST);
        frame.add(b2, BorderLayout.WEST);
        frame.add(b3, BorderLayout.NORTH);
        frame.add(b4, BorderLayout.SOUTH);
        frame.add(b5, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
