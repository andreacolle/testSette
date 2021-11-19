package it.andreagroup.recensioni.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.andreagroup.recensioni.data.entity.Recensione;

public interface RecensioneRepository extends MongoRepository<Recensione, Integer>{

	List<Recensione> findByIdarticolo(Integer idarticolo);


}
