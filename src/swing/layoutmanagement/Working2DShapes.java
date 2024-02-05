package swing.layoutmanagement;

import javax.swing.*;
import java.awt.*;

public class Working2DShapes extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D graphics2D = (Graphics2D) g;

        //line
        graphics2D.drawLine(10,10,10,100);
        //circle
        graphics2D.drawOval(100,10,40,40);

        //triangle
        int[] x ={100,150,50};
        int[] y ={100,200,200};
        graphics2D.drawPolygon(x,y,3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Working2DShapes());
        frame.setBounds(10,10,500,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
