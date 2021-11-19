package it.andreagroup.recensioni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.andreagroup.recensioni.converter.Converter;
import it.andreagroup.recensioni.data.dto.RecensioneDTO;
import it.andreagroup.recensioni.data.entity.Recensione;
import it.andreagroup.recensioni.repository.RecensioneRepository;

@Service
public class RecensioneServiceImpl {

	@Autowired
	Converter converter;


	@Autowired
	RecensioneRepository recensioneRepository;



	public List<RecensioneDTO> findRecensioniPerArticolo(Integer idarticolo) {
		List<Recensione> recensioni = recensioneRepository.findByIdarticolo(idarticolo);
		List<RecensioneDTO> recensionidto = converter.convertEntityToDto(recensioni);
		return recensionidto;
	}
}
