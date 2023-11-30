package com.khaoula.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khaoula.dto.EtudiantRequestDTO;
import com.khaoula.dto.EtudiantResponseDTO;
import com.khaoula.repositories.EtudiantRepository;
import com.khaoula.services.EtudiantServiceInterface;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")

public class RestController {
	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	EtudiantServiceInterface etudiantServiceInterface;
	
	@GetMapping("/etudiants")
	public List<EtudiantResponseDTO> getAll(){
		return etudiantServiceInterface.listerEtudiants();
	}
	
	@GetMapping("/etudiants/{id}")
	public EtudiantResponseDTO getId(@PathVariable("id") Integer id) {
		return etudiantServiceInterface.etudiantById(id);
	}
	
	@PutMapping("/etudiants{id}")
	public void modifier(@PathVariable("id") Integer id, @RequestBody EtudiantRequestDTO e) {
		
		etudiantServiceInterface.update(id, e);
	}
	
	@PostMapping("/etudiants")
	public void ajouter(@RequestBody EtudiantRequestDTO e) {
		
		etudiantServiceInterface.add(e);
	}
	
	@DeleteMapping("/etudiants/{id}")
	public void supprimer(@PathVariable Integer id) {
		etudiantServiceInterface.supprime(id);
	}

}
