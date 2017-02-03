package br.com.novatrixbr.model;

import javax.persistence.*;

/**
 * Created by bruno on 2/2/17.
 */

@Entity
@Table(name = "trg_target")
public class Target {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trg_id")
    private Long id;

    @Column(name = "trg_desc")
    private String description;

    @Column(name = "trg_value")
    private int value;

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Target{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}
