package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Stats {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Integer currentActivity;

    @Column(nullable = false)
    private Integer predictedActivity;

    @Column(nullable = false)
    private Date updateDate;

    @Override
    public String toString() {
        return "Stats{" +
                "id=" + id +
                ", currentActivity=" + currentActivity +
                ", predictedActivity=" + predictedActivity +
                ", updateDate=" + updateDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return id.equals(stats.id) &&
                currentActivity.equals(stats.currentActivity) &&
                predictedActivity.equals(stats.predictedActivity) &&
                updateDate.equals(stats.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currentActivity, predictedActivity, updateDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCurrentActivity() {
        return currentActivity;
    }

    public void setCurrentActivity(Integer currentActivity) {
        this.currentActivity = currentActivity;
    }

    public Integer getPredictedActivity() {
        return predictedActivity;
    }

    public void setPredictedActivity(Integer predictedActivity) {
        this.predictedActivity = predictedActivity;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


}
