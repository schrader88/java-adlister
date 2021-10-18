package model;

import java.io.Serializable;
import java.util.Arrays;

public class Author implements Serializable {
    private long id;
    private String firstName;
    private String lastName;
    private String[] listOfBooks;
    private String genres;

    public Author() {
    }

    public Author(long id, String firstName, String lastName, String[] listOfBooks, String genres) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.listOfBooks = listOfBooks;
        this.genres = genres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(String[] listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", listOfBooks=" + Arrays.toString(listOfBooks) +
                ", genres='" + genres + '\'' +
                '}';
    }
}
