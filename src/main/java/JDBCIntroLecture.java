import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCIntroLecture {
    public static void main(String[] args) {
        System.out.println("Hello");

//        try {

//        register driver
//        create connection
//        create statement
//        (Select) execute the query with a statement
//        scroll through the ResultSet to print album artists

//        register driver

//            DriverManager.registerDriver(new Driver());

//        create connection

//        Must use codeup_test_db for getConnection. Config is currently set to aadlister_db.

//        create statement

//            Statement statement = connection.createStatement();

//        (Select) execute the query with a statement

//            ResultSet resultSet = statement.executeQuery("SELECT * FROM albums");

//        scroll through the ResultSet to print album artists
//        resultSet.next(); // look at first result

//            if (resultSet.next()) {
//                String firstArtist = resultSet.getString("artist");
//                String firstAlbum = resultSet.getString("name");
//                System.out.println(firstArtist);
//                System.out.println(firstAlbum);
//            }

//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name"));
//            }

//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("artist"));
//                System.out.println(resultSet.getString("name"));
//                System.out.println("-----------");
//            }

// ======================== ALBUM MODEL

//            String query = "SELECT * FROM albums";
//            ResultSet rs = statement.executeQuery(query);
//            List<Album> albums = new ArrayList<>();
//
//            while(rs.next()) {
//                Album album = new Album(rs.getLong("id"),
//                        rs.getString("artist"),
//                        rs.getString("name"),
//                        rs.getInt("release_date"),
//                        rs.getDouble("sales"),
//                        rs.getString("genre")
//                );
//                albums.add(album);
//            }
//            for (Album album : albums) {
//                System.out.println(album);
//                System.out.println("===============================");
//            }

            // ======================== UPDATE A RECORD

//            Album updateAlbum = new Album(
//                    2,
//                    "Prince",
//                    "Purple Rain",
//                    1984,
//                    50,
//                    "amazing"
//            );
//
//            String updateQuery = String.format("UPDATE albums SET artist = '%s', name = '%s', release_date = %d, sales = %f, genre = '%s' WHERE id = %d",
//                    updateAlbum.getArtist(),
//                    updateAlbum.getName(),
//                    updateAlbum.getReleaseDate(),
//                    updateAlbum.getSales(),
//                    updateAlbum.getGenre(),
//                    updateAlbum.getId()
//            );
//
//            System.out.println(updateQuery);
//
////            boolean returnsResultSet = statement.execute(updateQuery);
//            int numberOfRowsEffected = statement.executeUpdate(updateQuery);

            // ======================== INSERTING A RECORD

//             Album brandNewAlbum = new Album(
//                 "The Cure",
//                 "Disintegration",
//                 1989,
//                 15,
//                 "alt, goth, rock"
//             );
//
//             String insertQuery = String.format("INSERT INTO albums (artist, name, release_date, sales, genre) VALUES ('%s', '%s', %d, %f, '%s')",
//                 brandNewAlbum.getArtist(),
//                 brandNewAlbum.getName(),
//                 brandNewAlbum.getReleaseDate(),
//                 brandNewAlbum.getSales(),
//                 brandNewAlbum.getGenre()
//             );
//             System.out.println(insertQuery);
//

//            Inserts Album in DB =====================================
//             statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

//            Pull out PRIMARY KEY that was created ===================
//             ResultSet rs = statement.getGeneratedKeys();
//
//             if (rs.next()) {
//                 System.out.println("Inserted id is: " + rs.getLong(1));
//             }


//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
}
