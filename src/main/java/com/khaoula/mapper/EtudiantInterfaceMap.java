package com.khaoula.mapper;

import com.khaoula.dto.EtudiantRequestDTO;
import com.khaoula.dto.EtudiantResponseDTO;
import com.khaoula.entities.Etudiant;

public interface EtudiantInterfaceMap {
	
	public Etudiant etudiantRequestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO);
	public EtudiantResponseDTO etudiant2EtudiantResponseDTO(Etudiant etudiant);

}
