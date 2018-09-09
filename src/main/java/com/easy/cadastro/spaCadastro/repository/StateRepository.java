package com.easy.cadastro.spaCadastro.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.easy.cadastro.spaCadastro.entity.State;

/**
 * Created by Diego de Souza on 16/08/18.
 */

@RepositoryRestResource(collectionResourceRel = "state", path = "state")
public interface StateRepository extends PagingAndSortingRepository<State, Long> {
	
	// List<State> findByCountryId(@Param("id") final Long id);
}
