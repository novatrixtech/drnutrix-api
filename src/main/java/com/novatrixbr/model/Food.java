package com.novatrixbr.model;

import javax.persistence.*;

/**
 * Created by bruno on 2/1/17.
 */
@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "food_id")
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "measure")
    private String measure;

    @Column(name = "qty")
    private String quantity;

    @Column(name = "energy")
    private String energy;

    @Column(name = "ptn")
    private String ptn;

    @Column(name = "cho")
    private String cho;

    @Column(name = "lip")
    private String lip;

    @Column(name = "ca")
    private String ca;

    @Column(name = "fe")
    private String fe;

    @Column(name = "vit_c")
    private String vitC;

    @Column(name = "vit_a")
    private String vitA;

    @Column(name = "typ_id")
    private Long type;

    @Column(name = "grp_id")
    private Long group;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getPtn() {
        return ptn;
    }

    public void setPtn(String ptn) {
        this.ptn = ptn;
    }

    public String getCho() {
        return cho;
    }

    public void setCho(String cho) {
        this.cho = cho;
    }

    public String getLip() {
        return lip;
    }

    public void setLip(String lip) {
        this.lip = lip;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getFe() {
        return fe;
    }

    public void setFe(String fe) {
        this.fe = fe;
    }

    public String getVitC() {
        return vitC;
    }

    public void setVitC(String vitC) {
        this.vitC = vitC;
    }

    public String getVitA() {
        return vitA;
    }

    public void setVitA(String vitA) {
        this.vitA = vitA;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", measure='" + measure + '\'' +
                ", quantity=" + quantity +
                ", energy=" + energy +
                ", ptn=" + ptn +
                ", cho=" + cho +
                ", lip=" + lip +
                ", ca=" + ca +
                ", fe=" + fe +
                ", vitC=" + vitC +
                ", vitA=" + vitA +
                ", type=" + type +
                ", group=" + group +
                '}';
    }
}
