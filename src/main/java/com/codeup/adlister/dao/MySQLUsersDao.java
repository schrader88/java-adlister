package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
            );
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

//    Not quite done with method below, must find out how to return User object:

//    WORK IN PROGRESS     //

    @Override
    public User findByUsername(String username) {
        try {
            String safeSearchQuery = "SELECT * FROM users WHERE username = ?";

            PreparedStatement ps = connection.prepareStatement(safeSearchQuery);

            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            return new User (
                    rs.getLong("id"),
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("password")
            );
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        try {
            String insertQuery = String.format("INSERT INTO users (username, email, password) VALUES (?, ?, ?)");

            PreparedStatement ps = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            rs.next();

            return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }
}
