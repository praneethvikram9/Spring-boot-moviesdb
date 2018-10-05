package com.stackroute.moviesdb.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Movies {

    @Id
    int MovieId;
    String title;
    String Cast;
    String Crew;
    String similarMovies;
    int ratings;

    public int getMovieId() {
        return MovieId;
    }

    public void setMovieId(int movieId) {
        MovieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCast() {
        return Cast;
    }

    public void setCast(String cast) {
        Cast = cast;
    }

    public String getCrew() {
        return Crew;
    }

    public void setCrew(String crew) {
        Crew = crew;
    }

    public String getSimilarMovies() {
        return similarMovies;
    }

    public void setSimilarMovies(String similarMovies) {
        this.similarMovies = similarMovies;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public Movies() {
    }

    public Movies(int movieId, String title, String cast, String crew, String similarMovies, int ratings) {
        MovieId = movieId;
        this.title = title;
        Cast = cast;
        Crew = crew;
        this.similarMovies = similarMovies;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "MovieId=" + MovieId +
                ", title='" + title + '\'' +
                ", Cast='" + Cast + '\'' +
                ", Crew='" + Crew + '\'' +
                ", similarMovies='" + similarMovies + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
