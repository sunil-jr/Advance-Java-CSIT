package db;

import java.sql.*;

public class DatabaseExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "123456");
        String query = "INSERT into class values(? ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setInt(1, 5);
//            statement.setString(2, "BHM");
//            statement.execute();

            ResultSet resultSet = statement.executeQuery("select * from class");
            while (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                System.out.println("----------------------------------");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("----------------------------------");
            }
        }
        connection.close();
    }
}
