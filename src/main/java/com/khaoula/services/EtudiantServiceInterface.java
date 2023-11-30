package com.khaoula.services;

import java.util.List;

import com.khaoula.dto.EtudiantRequestDTO;
import com.khaoula.dto.EtudiantResponseDTO;

public interface EtudiantServiceInterface {
	
	
	//POST
	public void add(EtudiantRequestDTO etudiantRequestDTO);
	//Get
	public List<EtudiantResponseDTO> listerEtudiants();
	//Get By id
	public EtudiantResponseDTO etudiantById(Integer id);
	//put
	public void update(Integer id, EtudiantRequestDTO e);
	//Delete
	public void supprime(Integer id);

}
