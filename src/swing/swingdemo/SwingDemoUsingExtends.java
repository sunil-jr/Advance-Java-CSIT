package swing.swingdemo;

import javax.swing.*;

public class SwingDemoUsingExtends extends JFrame {
   public SwingDemoUsingExtends(){
       setTitle("Swing extend");
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setSize(300,300);
       JButton btn = new JButton("Extends");
       add(btn);

   }

    public static void main(String[] args) {
      new SwingDemoUsingExtends();
    }
}
