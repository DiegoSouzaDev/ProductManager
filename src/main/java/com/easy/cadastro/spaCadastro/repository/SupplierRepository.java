package com.easy.cadastro.spaCadastro.repository;

import com.easy.cadastro.spaCadastro.entity.Supplier;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Diego de Souza on 15/08/18.
 */
@Repository
public interface SupplierRepository extends PagingAndSortingRepository<Supplier, Long> {


}
