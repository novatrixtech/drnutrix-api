package com.novatrixbr.model;

/**
 * Created by bruno on 2/2/17.
 */
public class MacroData {

    private double carbs;
    private double lips;
    private double proteins;

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getLips() {
        return lips;
    }

    public void setLips(double lips) {
        this.lips = lips;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    @Override
    public String toString() {
        return "MacroData{" +
                "carbs=" + carbs +
                ", lips=" + lips +
                ", proteins=" + proteins +
                '}';
    }
}
