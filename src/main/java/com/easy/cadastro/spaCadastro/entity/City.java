package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Diego de Souza on 06/08/18.
 */
@Getter
@Setter
@Entity
public class City {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private State state;

}
