package com.jdbdy.handle.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "movie_show_info")
public class MovieShowInfo implements Serializable {
    @Column(name = "show_id")
    private Integer showId;

    @Column(name = "movie_id")
    private String movieId;

    @Column(name = "show_time")
    private Date showTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "see_people")
    private Integer seePeople;

    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * @return show_id
     */
    public Integer getShowId() {
        return showId;
    }

    /**
     * @param showId
     */
    public void setShowId(Integer showId) {
        this.showId = showId;
    }

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
     * @return show_time
     */
    public Date getShowTime() {
        return showTime;
    }

    /**
     * @param showTime
     */
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return see_people
     */
    public Integer getSeePeople() {
        return seePeople;
    }

    /**
     * @param seePeople
     */
    public void setSeePeople(Integer seePeople) {
        this.seePeople = seePeople;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", showId=").append(showId);
        sb.append(", movieId=").append(movieId);
        sb.append(", showTime=").append(showTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", seePeople=").append(seePeople);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}