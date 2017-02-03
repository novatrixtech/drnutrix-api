package com.novatrixbr.model;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by bruno on 2/1/17.
 */

@Entity
@Table(name = "uhb_userhabits")
public class UserHabits {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uhb_id")
    private Long id;

    @Column(name = "usu_id")
    private Long user;

    @Column(name = "food_id")
    private Long food;

    @Column(name = "uhb_points")
    private int points;

    @Column(name = "uhb_datetime")
    private Calendar datetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Long getFood() {
        return food;
    }

    public void setFood(Long food) {
        this.food = food;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Calendar getDatetime() {
        return datetime;
    }

    public void setDatetime(Calendar datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "UserHabits{" +
                "id=" + id +
                ", user=" + user +
                ", food=" + food +
                ", points=" + points +
                ", datetime=" + datetime +
                '}';
    }
}
