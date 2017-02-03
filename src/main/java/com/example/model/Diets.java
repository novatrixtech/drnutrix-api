package com.example.model;

import javax.persistence.*;

/**
 * Created by bruno on 2/2/17.
 */

@Entity
@Table(name = "diet")
public class Diets {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "diet_id")
    private Long id;

    @Column(name = "dt_id")
    private Long diet;

    @Column(name = "usu_id")
    private Long user;

    @Column(name = "diet_lipids")
    private double lipids;

    @Column(name = "diet_carbs")
    private double carbs;

    @Column(name = "diet_protein")
    private double protein;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDiet() {
        return diet;
    }

    public void setDiet(Long diet) {
        this.diet = diet;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public double getLipids() {
        return lipids;
    }

    public void setLipids(double lipids) {
        this.lipids = lipids;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getProteins() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        return "Diets{" +
                "id=" + id +
                ", diet=" + diet +
                ", user=" + user +
                ", lipids=" + lipids +
                ", carbs=" + carbs +
                ", protein=" + protein +
                '}';
    }
}
