package com.renan.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.renan.cursomc.domain.Categorie;
import com.renan.cursomc.services.CategorieService;

@RestController
@RequestMapping(value="/categories")
public class CategoriaResource {
	
	@Autowired
	private CategorieService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categorie obj = service.find(id);
		return ResponseEntity.ok().body(obj);		
		
	}

}
