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



}
