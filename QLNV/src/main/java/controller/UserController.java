package controller;


import connect.MyConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserController {

    public static boolean authenticateUser(User user) {
        try (Connection connection = MyConnection.getConnection()) {
            String query = "SELECT * FROM User WHERE Username=? AND Password=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getPassword());
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public static boolean registerUser(User user) {
        try (Connection connection = MyConnection.getConnection()) {
            String query = "INSERT INTO User (Username, Password) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getPassword());
                int rowsAffected = preparedStatement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean changePassword(User user, String newPassword) {
        try (Connection connection = MyConnection.getConnection()) {
            // Check if the current username and password are correct
            if (authenticateUser(user)) {
                // Update the password
                String updateQuery = "UPDATE User SET Password=? WHERE Username=?";
                try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
                    updateStatement.setString(1, newPassword);
                    updateStatement.setString(2, user.getUsername());
                    int rowsAffected = updateStatement.executeUpdate();
                    return rowsAffected > 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
