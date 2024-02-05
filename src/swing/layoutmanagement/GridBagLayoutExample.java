package swing.layoutmanagement;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {
    public GridBagLayoutExample() {
        setTitle("Grid Bag Layout");
        setSize(400, 400);

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");

        JPanel jPanel = new JPanel(new GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();

        cst.fill= GridBagConstraints.HORIZONTAL;
        cst.gridx=0;
        cst.gridy =0;
        jPanel.add(b1,cst);

        cst.fill= GridBagConstraints.HORIZONTAL;
        cst.gridx=1;
        cst.gridy =0;
        jPanel.add(b2,cst);

        cst.fill= GridBagConstraints.HORIZONTAL;
        cst.gridx=2;
        cst.gridy =0;
        jPanel.add(b3,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 1;
        cst.gridwidth=3;
        jPanel.add(b4,cst);

        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 2;
        cst.gridwidth=1;
        jPanel.add(b5,cst);


        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(jPanel);


    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
