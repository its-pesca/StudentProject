package com.khaoula;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.khaoula.entities.Etudiant;
import com.khaoula.entities.Filiere;
import com.khaoula.repositories.EtudiantRepository;

@SpringBootApplication
public class Etudiant3Application {

	public static void main(String[] args) {
		SpringApplication.run(Etudiant3Application.class, args);
	}
	
@Bean
CommandLineRunner start(EtudiantRepository etudiantRepository) {
	
	return args -> {
		etudiantRepository.save(Etudiant.builder()
				.apogee(20023445)
				.nom("Ali")
				.prenom("MOHAMMADI")
				.email("ali.mohammadi@um5r.ac.ma")
				.filiere(Filiere.Mathematiques).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20025505)
				.nom("Khaoula")
				.prenom("JADI MOUSSA")
				.email("khaoula.jadimoussa@um5r.ac.ma")
				.filiere(Filiere.Informatique).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20021234)
				.nom("Sami")
				.prenom("Ali")
				.email("sami.ali@um5r.ac.ma")
				.filiere(Filiere.Physique).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20024567)
				.nom("Sara")
				.prenom("ghali")
				.email("sara.ghali@um5r.ac.ma")
				.filiere(Filiere.Chimie).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20022378)
				.nom("Mohammed")
				.prenom("CLAY")
				.email("c.mohammed@um5r.ac.ma")
				.filiere(Filiere.Geologie).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20023212)
				.nom("Hajar")
				.prenom("slaoui")
				.email("s.hajar@um5r.ac.ma")
				.filiere(Filiere.Biologie).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20027632)
				.nom("Alae")
				.prenom("ALAOUI")
				.email("a.alaoui@um5r.ac.ma")
				.filiere(Filiere.Mathematiques).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20022390)
				.nom("Wiam")
				.prenom("TAYBI")
				.email("wiam.taybi@um5r.ac.ma")
				.filiere(Filiere.Informatique).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20021287)
				.nom("Omar")
				.prenom("Sami")
				.email("o.sami@um5r.ac.ma")
				.filiere(Filiere.Physique).build());
		
		etudiantRepository.save(Etudiant.builder()
				.apogee(20022374)
				.nom("Samia")
				.prenom("AKIL")
				.email("s.ali@um5r.ac.ma")
				.filiere(Filiere.Chimie).build());
		
		//recuperer les etudiants de la base de donnees H2
		
		List<Etudiant> listes = etudiantRepository.findAll();
		
		for (Etudiant etd:listes) {
			System.out.println("***********************************");
			System.out.println(etd.getApogee());
			System.out.println(etd.getNom());
			System.out.println(etd.getPrenom());
			System.out.println(etd.getEmail());
			System.out.println(etd.getFiliere());
			
		}
	};
}

}
