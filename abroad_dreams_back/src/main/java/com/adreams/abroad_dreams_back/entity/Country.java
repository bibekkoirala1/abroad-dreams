package com.adreams.abroad_dreams_back.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="countries")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(generator = "countries_seq_gen", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="countryname", nullable=false)
    private String countryname;

    @Column(name="countryshort", nullable=false)
    private String countryshort;

}
