package com.mediatek.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mediatek.bean.Chiffre;
import com.mediatek.bean.Client;
@Repository
@CrossOrigin
public interface ChiffreDao extends JpaRepository<Chiffre, Long> {
    
	public Chiffre findByNumC(Long numC);
	public Chiffre findByNom(String nom);

}
