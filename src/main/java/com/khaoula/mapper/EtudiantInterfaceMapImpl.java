package com.khaoula.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.khaoula.dto.EtudiantRequestDTO;
import com.khaoula.dto.EtudiantResponseDTO;
import com.khaoula.entities.Etudiant;

@Component
public class EtudiantInterfaceMapImpl implements EtudiantInterfaceMap {

	@Override
	public Etudiant etudiantRequestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO) {
		Etudiant e= new Etudiant();
		
		e.setApogee(etudiantRequestDTO.getApogee());
		e.setNom(etudiantRequestDTO.getNom());
		e.setPrenom(etudiantRequestDTO.getPrenom());
		e.setFiliere(etudiantRequestDTO.getFiliere());

		return e;
	}

	@Override
	public EtudiantResponseDTO etudiant2EtudiantResponseDTO(Etudiant etudiant) {
		EtudiantResponseDTO e = new EtudiantResponseDTO();
		
		BeanUtils.copyProperties(etudiant, e);
		return e;
	}

}
