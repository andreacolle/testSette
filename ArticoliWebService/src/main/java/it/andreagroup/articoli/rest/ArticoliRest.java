package it.andreagroup.articoli.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.andreagroup.articoli.data.dto.ArticoloDTO;
import it.andreagroup.articoli.service.ArticoliServiceImpl;

@RestController
@RequestMapping("/api/rest")
public class ArticoliRest {

		@Autowired
		ArticoliServiceImpl articoloService;
		
		@GetMapping
		public List<ArticoloDTO> getArticoliDTO() {
			return articoloService.findAll();
			
		}

	
		
		
	
}
