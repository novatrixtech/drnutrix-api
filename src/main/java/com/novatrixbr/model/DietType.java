package com.novatrixbr.model;

import javax.persistence.*;

/**
 * Created by bruno on 2/2/17.
 */
@Entity
@Table(name = "dt_diettypes")
public class DietType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dt_id")
    private Long id;

    @Column(name = "dt_carbs")
    private double dietCarbs;

    @Column(name = "dt_lipids")
    private double dietLips;

    @Column(name = "dt_proteins")
    private double dietProteins;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDietCarbs() {
        return dietCarbs;
    }

    public void setDietCarbs(double dietCarbs) {
        this.dietCarbs = dietCarbs;
    }

    public double getDietLips() {
        return dietLips;
    }

    public void setDietLips(double dietLips) {
        this.dietLips = dietLips;
    }

    public double getDietProteins() {
        return dietProteins;
    }

    public void setDietProteins(double dietProteins) {
        this.dietProteins = dietProteins;
    }

    @Override
    public String toString() {
        return "DietType{" +
                "id=" + id +
                ", dietCarbs=" + dietCarbs +
                ", dietLips=" + dietLips +
                ", dietProteins=" + dietProteins +
                '}';
    }
}
