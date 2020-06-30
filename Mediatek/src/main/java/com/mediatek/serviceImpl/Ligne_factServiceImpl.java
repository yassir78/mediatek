package com.mediatek.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Ligne_fact;
import com.mediatek.dao.FactureDao;
import com.mediatek.dao.Ligne_factDao;
import com.mediatek.dao.ProduitDao;
import com.mediatek.service.FactureService;
import com.mediatek.service.Ligne_factService;

@Service
public class Ligne_factServiceImpl implements Ligne_factService{
 
  @Autowired
  private Ligne_factDao ligne_factDao;
  @Autowired
  private ProduitDao produitDao;
  @Autowired
  private FactureService factureService;

@Override
public List<Ligne_fact> findAll() {
	return ligne_factDao.findAll();
	/////////////////////
}

@Override
public void delete(Long id) {
	Ligne_fact ligne_fact = ligne_factDao.getOne(id);
	if(ligne_fact != null) {
		produitDao.deleteById(ligne_fact.getProduit().getNum_prod());
		factureService.delete(ligne_fact.getFacture().getNum_fact());
	}
	ligne_factDao.deleteById(id);
	
}
 
}
