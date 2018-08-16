package com.easy.cadastro.spaCadastro.repository;

import com.easy.cadastro.spaCadastro.entity.ProductType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Diego de Souza on 16/08/18.
 */

@RepositoryRestResource(collectionResourceRel = "productType", path = "productType")
public interface ProductTypeRepository extends PagingAndSortingRepository<ProductType, Long> {


}
