package model;

import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artistName;
    private String name;
    private int release_date;
    private String genre;
    private float sales;

    public Album() {

    }

    public Album(long id, String artistName, String name, int release_date, String genre, float sales) {
        this.id = id;
        this.artistName = artistName;
        this.name = name;
        this.release_date = release_date;
        this.genre = genre;
        this.sales = sales;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", artistName='" + artistName + '\'' +
                ", name='" + name + '\'' +
                ", release_date=" + release_date +
                ", genre='" + genre + '\'' +
                ", sales=" + sales +
                '}';
    }
}
