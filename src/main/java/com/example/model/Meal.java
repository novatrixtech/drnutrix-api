package com.example.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by bruno on 1/31/17.
 */

@Entity
@Table(name = "meal")
public class Meal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "meal_id")
    private Long id;

    @Column(name = "food_id")
    private Long foodId;

    @Column(name = "usu_id")
    private Long userId;

    @Column(name = "dt_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;

    @Column(name = "typ_id")
    private Long type;

    @Column(name = "score")
    private long score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", foodId=" + foodId +
                ", userId=" + userId +
                ", dateTime=" + dateTime +
                ", type=" + type +
                ", score=" + score +
                '}';
    }
}
