package swing.swingdemo;

import javax.swing.*;

public class SwingFirst {

   /* Component -----> GUI JTextArea, JTextField, JRadioButton, etc...
    Container---> Component store container
    top level-->JFrame
    lightweight--> JPanel

    1. extend JFrame
    2.JFrame ko object



    */
   public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setTitle("Swing demo");
       frame.setSize(300,400);

       //component
       JButton button = new JButton("Click me");

       frame.add(button);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



   }

}
