package it.andreagroup.articoli.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.andreagroup.articoli.data.dto.ArticoloDTO;
import it.andreagroup.articoli.data.entity.Articoli;
import it.andreagroup.articoli.openfeign.ArticoliClient;

@Component
public class Converter {
	
	@Autowired
	ArticoliClient articoliClient;

	public List<ArticoloDTO> convertEntityToDto(List<Articoli> entarticoli) {

		List<ArticoloDTO> articolidto = new ArrayList<>();

		for(int i = 0; i < entarticoli.size(); i++) {
			ArticoloDTO articoloDTO = new ArticoloDTO();
			articoloDTO.setNomearticolo(entarticoli.get(i).getNomearticolo());
			
			articolidto.add(articoloDTO);

		}
		return articolidto;

	}

}
