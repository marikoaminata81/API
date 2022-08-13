package com.ami.Apigestion.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class NombrePopulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pop;
    private int Annee;
    private int ChiffrePopulation;

}
