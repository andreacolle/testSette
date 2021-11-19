package it.andreagroup.recensioni.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.andreagroup.recensioni.data.dto.RecensioneDTO;
import it.andreagroup.recensioni.data.entity.Recensione;

@Component
public class Converter {

	public List<RecensioneDTO> convertEntityToDto(List<Recensione> entrecensioni) {

		List<RecensioneDTO> recensionidto = new ArrayList<>();

		for(int i = 0; i < entrecensioni.size(); i++) {
			RecensioneDTO recensionedto = new RecensioneDTO();
			recensionedto.setRecensione(entrecensioni.get(i).getRecensione());
			recensionidto.add(recensionedto);


		}
		return recensionidto;
	}

}
