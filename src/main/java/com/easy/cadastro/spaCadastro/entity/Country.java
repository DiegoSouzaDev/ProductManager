package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Diego de Souza on 06/08/18.
 */

@Getter
@Setter
@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String abrev;

    @OneToMany(mappedBy = "country")
    private List<State> stateList;


}
