package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Diego de Souza on 06/08/18.
 */
@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String street;

    private String number;

    private String neighbourhood;

    @OneToOne
    private Supplier supplier;

    @OneToOne
    private City city;

    @OneToOne
    private State state;

    @OneToOne
    private Country country;
}
