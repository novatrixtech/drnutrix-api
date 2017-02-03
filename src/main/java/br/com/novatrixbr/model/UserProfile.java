package br.com.novatrixbr.model;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by bruno on 2/2/17.
 */
@Entity
@Table(name = "up_userprofile")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "up_id")
    private Long id;

    @Column(name = "up_weight")
    private double weight;

    @Column(name = "up_height")
    private double height;

    @Column(name = "trg_id")
    private Long target;

    @Column(name = "up_birthdate")
    private Calendar birthDate;

    @Column(name = "up_age")
    private int age;

    @Column(name = "sex_id")
    private Long sex;

    @Column(name = "usu_id")
    private Long user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Long getTarget() {
        return target;
    }

    public void setTarget(Long target) {
        this.target = target;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", weight=" + weight +
                ", height=" + height +
                ", target=" + target +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", sex=" + sex +
                ", user=" + user +
                '}';
    }
}
