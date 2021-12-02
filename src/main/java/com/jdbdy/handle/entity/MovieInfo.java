package com.jdbdy.handle.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "movie_info")
public class MovieInfo implements Serializable {
    @Column(name = "movie_id")
    private String movieId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "file_path")
    private String filePath;

    @Column(name = "time_length")
    private String timeLength;

    private Boolean mongdb;

    private static final long serialVersionUID = 1L;

    /**
     * @return movie_id
     */
    public String getMovieId() {
        return movieId;
    }

    /**
     * @param movieId
     */
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    /**
     * @return movie_name
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * @param movieName
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    /**
     * @return file_path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return time_length
     */
    public String getTimeLength() {
        return timeLength;
    }

    /**
     * @param timeLength
     */
    public void setTimeLength(String timeLength) {
        this.timeLength = timeLength;
    }

    /**
     * @return mongdb
     */
    public Boolean getMongdb() {
        return mongdb;
    }

    /**
     * @param mongdb
     */
    public void setMongdb(Boolean mongdb) {
        this.mongdb = mongdb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", movieId=").append(movieId);
        sb.append(", movieName=").append(movieName);
        sb.append(", filePath=").append(filePath);
        sb.append(", timeLength=").append(timeLength);
        sb.append(", mongdb=").append(mongdb);
        sb.append("]");
        return sb.toString();
    }
}