package com.novatrixbr.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bruno on 2/1/17.
 */

@Entity
@Table(name = "type")
public class FoodType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "typ_id")
    private Long id;

    @Column(name = "typ_desc")
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
        return "FoodType{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
