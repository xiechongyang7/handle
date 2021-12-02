package com.jdbdy.handle.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "movie_plan")
public class MoviePlan implements Serializable {
    @Column(name = "plan_id")
    private Integer planId;

    @Column(name = "movie_id")
    private String movieId;

    @Column(name = "plan_time")
    private String planTime;

    @Column(name = "read_result")
    private String readResult;

    @Column(name = "show_order")
    private Integer showOrder;

    private static final long serialVersionUID = 1L;

    /**
     * @return plan_id
     */
    public Integer getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(Integer planId) {
        this.planId = planId;
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
     * @return plan_time
     */
    public String getPlanTime() {
        return planTime;
    }

    /**
     * @param planTime
     */
    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    /**
     * @return read_result
     */
    public String getReadResult() {
        return readResult;
    }

    /**
     * @param readResult
     */
    public void setReadResult(String readResult) {
        this.readResult = readResult;
    }

    /**
     * @return show_order
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * @param showOrder
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", planId=").append(planId);
        sb.append(", movieId=").append(movieId);
        sb.append(", planTime=").append(planTime);
        sb.append(", readResult=").append(readResult);
        sb.append(", showOrder=").append(showOrder);
        sb.append("]");
        return sb.toString();
    }
}