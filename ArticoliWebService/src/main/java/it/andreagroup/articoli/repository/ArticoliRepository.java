package it.andreagroup.articoli.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.andreagroup.articoli.data.entity.Articoli;

public interface ArticoliRepository extends JpaRepository<Articoli, Integer> {

	
	
}
