package swing.swingextras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter extends JFrame {

    public WordCounter() {
        JTextArea area = new JTextArea();
        JButton button = new JButton("Count");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = area.getText();
                System.out.println("Char length: " + text.length());
                System.out.println("Word length: " + text.split(" ").length);

                int charLen = 0;
                int wordLen = 0;
                for (char c : text.toCharArray()) {
                    charLen++;
                    if (c == ' ') {
                        wordLen++;
                    }
                }
                wordLen++;
                System.out.println("Char length: " + charLen);
                System.out.println("Word length: " + wordLen);
            }
        });

        add(area);
        add(button);
        setLayout(new FlowLayout());
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WordCounter();
    }
}
