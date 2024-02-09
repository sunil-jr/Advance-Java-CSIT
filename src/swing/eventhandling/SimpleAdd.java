package swing.eventhandling;

import javax.swing.*;
import java.awt.event.*;

public class SimpleAdd extends JFrame implements MouseListener {
    JTextField num1;
    JTextField num2;
    JButton btn;
    JLabel result;

    public SimpleAdd() {
        setTitle("Adding numbers");
        setLayout(null);
        setBounds(10, 10, 500, 600);
        setVisible(true);

        JLabel lbl1 = new JLabel("First number:");
        lbl1.setBounds(10, 15, 100, 50);

        num1 = new JTextField();
        num1.setBounds(115, 15, 200, 50);
        num1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String abc = "asdhsagsahjd";
                String rev = "";
                for (char c : abc.toCharArray()) {
                    rev = c + rev;
                }

            }
        });

        JLabel lbl2 = new JLabel("Second number:");
        lbl1.setBounds(10, 70, 100, 50);


        num2 = new JTextField();
        num2.setBounds(115, 70, 200, 50);

        btn = new JButton("Add");
        btn.setBounds(115, 125, 300, 150);
        //adding action listener for button
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Action");
            }
        });
        btn.addMouseListener(this);

        result = new JLabel("Result: ");
        result.setBounds(115, 200, 300, 200);

        add(lbl1);
        add(lbl2);
        add(num1);
        add(num2);
        add(btn);
        add(result);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void add() {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        int sum = a + b;
        result.setText("Result: " + sum);
    }

    public void sub() {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        int diff = a - b;
        result.setText("Result: " + diff);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }


    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        add();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        sub();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    public static void main(String[] args) {
        new SimpleAdd();

    }
}
