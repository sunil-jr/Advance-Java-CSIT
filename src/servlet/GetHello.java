package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.*;

public class GetHello extends HttpServlet {

    public void doGet(HttpSevletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String userID = request.getParameter("userID");
            String password = request.getParameter("password");
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(response.getOutputStream()));
            Connection connection = DriverManager.getConnection("jbbc:mysqlasdknask");

            PreparedStatement preparedStatement = connection.prepareStatement("Select Password from user where Uid=?");
            preparedStatement.setInt(1, Integer.parseInt(userID));

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String savedPassword = resultSet.getString(1);
                if (password.equals(savedPassword)) {
                    printWriter.println("Login success!!!");
                } else {
                    printWriter.println("Invalid username or password!!!");
                }
            } else {
                printWriter.println("Invalid username or password!!!");
            }
            printWriter.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
