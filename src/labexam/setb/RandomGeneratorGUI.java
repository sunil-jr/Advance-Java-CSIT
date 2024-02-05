package labexam.setb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class RandomGeneratorGUI extends JFrame {
    private JTextField outputField;

    public RandomGeneratorGUI() {
        super("Random Generator");

        outputField = new JTextField(25);
        outputField.setEditable(false);
        outputField.setHorizontalAlignment(JTextField.CENTER);

        setLayout(new FlowLayout());
        add(outputField);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                generateRandomInteger();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                generateRandomDouble();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void generateRandomInteger() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        outputField.setText("Random Integer: " + randomNumber);
    }

    private void generateRandomDouble() {
        Random random = new Random();
        double randomDouble = random.nextDouble();
        outputField.setText("Random Double: " + randomDouble);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RandomGeneratorGUI());
    }
}

