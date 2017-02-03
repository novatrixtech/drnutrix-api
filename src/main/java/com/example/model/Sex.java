package com.example.model;

import javax.persistence.*;

/**
 * Created by bruno on 2/2/17.
 */

@Entity
@Table(name = "sex")
public class Sex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sex_id")
    private Long id;

    @Column(name = "sex_description")
    private String description;

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

    @Override
    public String toString() {
        return "Sex{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
