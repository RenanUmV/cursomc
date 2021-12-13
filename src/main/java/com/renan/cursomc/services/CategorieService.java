package com.renan.cursomc.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renan.cursomc.domain.Categorie;
import com.renan.cursomc.repositories.CategorieRepository;

@Service
public class CategorieService {
	
	
	@Autowired
	private CategorieRepository repo;  
	
	public Categorie find(Integer id) {
		Optional<Categorie> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
