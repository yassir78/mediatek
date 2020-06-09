package com.mediatek.service;

import java.util.List;

import com.mediatek.bean.Chiffre;

public interface ChiffreService {
	public Chiffre findByNumC(Long numC);
	public List<Chiffre> findAll();
	public Chiffre findByNom(String nom);
}
