package it.andreagroup.recensioni.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.andreagroup.recensioni.data.dto.RecensioneDTO;
import it.andreagroup.recensioni.service.RecensioneServiceImpl;

@RestController
@RequestMapping("/api/rest")
public class RecensioneRest {
	
	@Autowired 
	RecensioneServiceImpl recensioneService;
	
	@GetMapping("/recensioneperidarticolo/{id}")
	public List<RecensioneDTO> getRecensioneDTO(@PathVariable("id") Integer idarticolo) {
		return recensioneService.findRecensioniPerArticolo(idarticolo);
		
	}

}
