package com.renan.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renan.cursomc.domain.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
	
}
