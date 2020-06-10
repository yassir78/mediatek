package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mediatek.bean.Client;

@Repository
@CrossOrigin
public interface ClientDao  extends JpaRepository<Client,Long>{
	  public Client findByNom(String nom);
	  public Client findByEmailAndPassword(String email,String password);

}
