package br.com.novatrixbr.model;

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
    private int quantity;

    @Column(name = "energy")
    private double energy;

    @Column(name = "ptn")
    private double ptn;

    @Column(name = "cho")
    private double cho;

    @Column(name = "lip")
    private double lip;

    @Column(name = "ca")
    private double ca;

    @Column(name = "fe")
    private double fe;

    @Column(name = "vit_c")
    private double vitC;

    @Column(name = "vit_a")
    private double vitA;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getPtn() {
        return ptn;
    }

    public void setPtn(double ptn) {
        this.ptn = ptn;
    }

    public double getCho() {
        return cho;
    }

    public void setCho(double cho) {
        this.cho = cho;
    }

    public double getLip() {
        return lip;
    }

    public void setLip(double lip) {
        this.lip = lip;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

    public double getVitC() {
        return vitC;
    }

    public void setVitC(double vitC) {
        this.vitC = vitC;
    }

    public double getVitA() {
        return vitA;
    }

    public void setVitA(double vitA) {
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
