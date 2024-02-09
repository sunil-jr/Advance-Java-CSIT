package swing.layoutmanagement;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    //JFrame Creation using object showing the border layout example
        public BorderLayoutExample(){
            JButton b1 = new JButton("EAST");
            JButton b2 = new JButton("WEST");
            JButton b3 = new JButton("NORTH");
            JButton b4 = new JButton("SOUTH");
            JButton b5 = new JButton("CENTER");

            add(b1,BorderLayout.CENTER);
            add(b2,BorderLayout.NORTH);
            add(b3,BorderLayout.SOUTH);
            add(b4, BorderLayout.WEST);
            add(b5, BorderLayout.EAST);

            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(500,500);
        }
    public static void main(String[] args) {
       new BorderLayoutExample();
    }
}
