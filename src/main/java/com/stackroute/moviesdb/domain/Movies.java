package com.stackroute.moviesdb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Movies")
public class Movies {
    @Id
    @Column(name = "imdbId",nullable = false)
    private String imdbId;
    @Column(name = "movieTitle",nullable = false)
    private String movieTitle;
    @Column(name = "postedUrl",nullable = false)
    private String postedUrl;
    @Column(name = "rating",nullable = false)
    private float rating;
    @Column(name = "yearOfRelease",nullable = false)
    private String yearOfRelease;
    @Column(name = "comments",nullable = false)
    private String comments;

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getPostedUrl() {
        return postedUrl;
    }

    public void setPostedUrl(String postedUrl) {
        this.postedUrl = postedUrl;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public Movies() {
    }

    public Movies(String imdbId, String movieTitle, String postedUrl, float rating, String yearOfRelease, String comments) {
        this.imdbId = imdbId;
        this.movieTitle = movieTitle;
        this.postedUrl = postedUrl;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "imdbId='" + imdbId + '\'' +
                ", movieTitle='" + movieTitle + '\'' +
                ", postedUrl='" + postedUrl + '\'' +
                ", rating=" + rating +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }


}
