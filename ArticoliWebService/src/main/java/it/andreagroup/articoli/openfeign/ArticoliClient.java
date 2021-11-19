package it.andreagroup.articoli.openfeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.andreagroup.articoli.data.dto.RecensioneDTO;

// Pagina non richiesta ai fini della riuscita del test

@FeignClient(name = "MicroservizioRecensione", url = "http://localhost:5001")
public interface ArticoliClient {

	
	@GetMapping("/api/rest/recensioneperidarticolo/{id}")
	public List<RecensioneDTO> getRecensioniByIdarticolo(@PathVariable("id") Integer idarticolo);
	

	

	
	
	
}
