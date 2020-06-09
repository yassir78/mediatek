package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatek.bean.Chiffre;
@Repository
public interface ChiffreDao extends JpaRepository<Chiffre, Long> {
    
	public Chiffre findByNumC(Long numC);
	public Chiffre findByNom(String nom);
}
