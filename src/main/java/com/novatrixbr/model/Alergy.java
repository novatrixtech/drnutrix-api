package com.novatrixbr.model;

import javax.persistence.*;

/**
 * Created by bruno on 2/3/17.
 */
@Entity
@Table(name = "tpa_alergy")
public class Alergy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tpa_id")
    private Long id;

    @Column(name = "tpa_description")
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
        return "Alergy{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
