package com.easy.cadastro.spaCadastro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

/**
 * Created by Diego de Souza on 15/08/18.
 */

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Supplier supplier;

    @OneToOne(mappedBy = "product")
    private ProductType productType;

    private String referenceCode;

    private String description;

    private Double coastPrice;

    private Double icmsst;

    private Double ipi;

    private Double ncm;

    private Date lastUpdate;

    private String  observation;

    private Blob photo;




}
