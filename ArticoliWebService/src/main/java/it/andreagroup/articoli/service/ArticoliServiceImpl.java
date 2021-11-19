package it.andreagroup.articoli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.andreagroup.articoli.converter.Converter;
import it.andreagroup.articoli.data.dto.ArticoloDTO;
import it.andreagroup.articoli.data.entity.Articoli;
import it.andreagroup.articoli.repository.ArticoliRepository;

@Service
public class ArticoliServiceImpl {

	@Autowired
	Converter converter;

	@Autowired
	ArticoliRepository articoliRepository;

	public List<ArticoloDTO> findAll() {
		List<Articoli> articoli = articoliRepository.findAll();
		List<ArticoloDTO> articoliDto = converter.convertEntityToDto(articoli);
		return articoliDto;

	}
}
