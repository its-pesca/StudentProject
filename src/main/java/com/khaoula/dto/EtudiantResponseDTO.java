package com.khaoula.dto;

import com.khaoula.entities.Filiere;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class EtudiantResponseDTO {
	
	private Integer apogee;
	
	private String nom;
	
	private String prenom;
	
	private Filiere filiere;

}
