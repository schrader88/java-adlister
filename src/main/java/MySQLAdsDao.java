import com.mysql.cj.jdbc.Driver;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());

            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
//        Create empty ads array list
        List<Ad> ads = new ArrayList<>();

//        defining the select query
        String query = "SELECT * FROM ads";

        try {
//            create a statement object
            Statement statement = connection.createStatement();

//            executeQuery
            ResultSet rs = statement.executeQuery(query);

//            iterate over result set to create ad objects and store in an array list
            while(rs.next()) {
                Ad ad = new Ad(
                  rs.getLong("id"),
                  rs.getLong("user_id"),
                  rs.getString("title"),
                  rs.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
//        return the array list of ad objects
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long lastInsertedId = 0;

        String insertQuery = String.format(
                "INSERT INTO ads (title, description) VALUES ('%s', '%s')",
                ad.getTitle(),
                ad.getDescription()
        );

        return null;
    }
}
