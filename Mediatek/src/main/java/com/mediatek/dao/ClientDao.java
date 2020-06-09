package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatek.bean.Client;

@Repository
public interface ClientDao  extends JpaRepository<Client,Long>{
	  public Client findByNom(String nom);

}
