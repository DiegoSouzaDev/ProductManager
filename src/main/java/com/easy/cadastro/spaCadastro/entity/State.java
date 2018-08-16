package com.easy.cadastro.spaCadastro.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Diego de Souza on 06/08/18.
 */


@Entity
public class State {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String abrev;

    @OneToMany(mappedBy = "state")
    private List<City> city;


    @ManyToOne(fetch = FetchType.EAGER)
    private Country country;
}
