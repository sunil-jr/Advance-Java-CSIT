package swing.layoutmanagement;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class GroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPanel = frame.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);

        frame.setLayout(groupLayout);

        JLabel label = new JLabel("Button");
        JButton button = new JButton("Click here");

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(label)
                        .addComponent(button)
        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(label)
                        .addComponent(button)
        );

        frame.pack();
        frame.setVisible(true);

    }

    public boolean isPossible(int[] arr) {

        // l: 3
        // 0,1,2
        // l:5
        // 2,1,0,4,3

        //0,1,2,3,4

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) return false;
        }
        return true;
    }
}
