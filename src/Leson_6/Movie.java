package Leson_6;

import java.util.Arrays;

public class Movie {
    String title;
    String genre;
    int realseyear;
    Actor[] actor;

    public Movie(String title, String genre, int realseyear, Actor[] actor) {
        this.title = title;
        this.genre = genre;
        this.realseyear = realseyear;
        this.actor = actor;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", realseyear=" + realseyear +
                ", actor=" + Arrays.toString(actor) +
                '}';
    }
}

