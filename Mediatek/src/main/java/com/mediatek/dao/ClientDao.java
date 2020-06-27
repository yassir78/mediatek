package com.mediatek.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mediatek.bean.Client;

@Repository
@CrossOrigin
public interface ClientDao extends JpaRepository<Client, Long> {
	public Client findByNom(String nom);

	public Client findByEmailAndPassword(String email, String password);

	public List<Client> findByrole(String role);
	
	 public Client findByEmailAndNomAndPrenom(String email,String nom,String prenom);
}
