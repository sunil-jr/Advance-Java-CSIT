package movie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class MovieRental extends JFrame {

    private JTextField idField;
    private JTextField titleField;
    private JTextField genreField;
    private JTextField languageField;
    private JTextField lengthField;

    public MovieRental() {
        JLabel idLabel = new JLabel("ID: ");
        JLabel titleLabel = new JLabel("Title: ");
        JLabel genreLabel = new JLabel("Genre: ");
        JLabel languageLabel = new JLabel("Language: ");
        JLabel lengthLabel = new JLabel("Length: ");
        idField = new JTextField();
        titleField = new JTextField();
        genreField = new JTextField();
        languageField = new JTextField();
        lengthField = new JTextField();

        JButton jButton = new JButton("OK");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "123456");
                    String insertQuery = "INSERT INTO movie VALUE(?,?,?,?,?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

                    preparedStatement.setInt(1, Integer.parseInt(idField.getText()));
                    preparedStatement.setString(2, titleField.getText());
                    preparedStatement.setString(3, genreField.getText());
                    preparedStatement.setString(4, languageField.getText());
                    preparedStatement.setInt(5, Integer.parseInt(lengthField.getText()));

                    preparedStatement.execute();

                    System.out.println("Saved successfully!!!");
                    preparedStatement.close();
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error while saving movie: " + e.getMessage());
                } catch (ClassNotFoundException e) {
                    System.err.println("Mysql Driver not found!!! " + e.getMessage());
                }
            }
        });

        setLayout(new GridLayout(6, 2));

        add(idLabel);
        add(idField);
        add(titleLabel);
        add(titleField);
        add(genreLabel);
        add(genreField);
        add(languageLabel);
        add(languageField);
        add(lengthLabel);
        add(lengthField);
        add(jButton);

        setSize(200, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
        new MovieRental();
    }
}
