package com.adreams.abroad_dreams_back.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "institutions")
@Getter
@Setter
public class Institution {

    @Id
    @GeneratedValue(generator = "institutions_seq_gen", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "institution_name", nullable = false)
    private String institutionName;

    @Column(name = "address", nullable = false)
    private String address;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "official_website")
    private String officialWebsite;

        // Other attributes and methods as needed
}


