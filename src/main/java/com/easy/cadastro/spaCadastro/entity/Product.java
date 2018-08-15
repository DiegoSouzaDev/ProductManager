package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.sql.Blob;
import java.util.Date;

/**
 * Created by Diego de Souza on 15/08/18.
 */

@Entity
@Getter
@Setter
public class Product {

    @GeneratedValue
    @Column
    private Long id;

    @Column
    private Supplier supplier;

    @Column
    private ProductType productType;

    @Column
    private String referenceCode;

    @Column
    private String description;

    @Column
    private Double coastPrice;

    @Column
    private Double icmsst;

    @Column
    private Double ipi;

    @Column
    private Double ncm;

    @Column
    private Date lastUpdate;

    @Column
    private String  observation;

    @Column
    private Blob photo;




}
