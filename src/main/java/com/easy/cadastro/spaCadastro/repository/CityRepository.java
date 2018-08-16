package com.easy.cadastro.spaCadastro.repository;

import com.easy.cadastro.spaCadastro.entity.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Diego de Souza on 16/08/18.
 */

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRepository extends PagingAndSortingRepository<City, Long> {

    List<City> findByStateId(@Param("id") final Long id);
}
