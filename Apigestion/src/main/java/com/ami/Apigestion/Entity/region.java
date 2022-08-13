package com.ami.Apigestion.Entity;

import com.ami.Apigestion.Entity.NombrePopulation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CodeRegion")
    private int CodeRegion;
    private String NomRegion;
    private String DomaineActivite;

    private int Superficie;
    private String LangueMaj;


    @ManyToOne
    @JoinColumn(name = "nombrepopulation_id_pop")
    private NombrePopulation nombrepopulation;

    @ManyToOne
    @JoinColumn(name = "id_pays")
    private Pays pays;


}