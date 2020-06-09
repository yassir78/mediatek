package com.mediatek.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Produit;
import com.mediatek.dao.ProduitDao;
import com.mediatek.service.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	private ProduitDao produitDao;

	@Override
	public Produit findBylibelle(String libelle) {
		return produitDao.findBylibelle(libelle);
	}

	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return produitDao.findAll();
	}

	@Override
	public Produit save(Produit produit) {
		// TODO Auto-generated method stub
		Produit product = produitDao.findBylibelle(produit.getLibelle());
		if (product == null) {
			return produitDao.save(produit);
		}
		return null;

	}

	@Override
	@Transactional
	public void deleteBylibelle(String libelle) {
		// TODO Auto-generated method stub
		Produit produit = findBylibelle(libelle);
		if (produit != null) {
			System.out.println("le produit" + produit);

			produitDao.deleteBylibelle(libelle);
		} else {
			System.out.println("le produit n'existe pas ");
		}

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		produitDao.deleteById(id);

	}

	@Override
	public Produit update(Long id, Produit produit) {
		// TODO Auto-generated method stub
		produit.setNum_prod(id);
		return produitDao.save(produit);
	}

	@Override
	public String demande(Long num_prod) {
		// TODO Auto-generated method stub
		return produitDao.demande(num_prod);
	}
}
