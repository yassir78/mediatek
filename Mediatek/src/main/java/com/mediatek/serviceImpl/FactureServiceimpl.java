package com.mediatek.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Client;
import com.mediatek.bean.Facture;
import com.mediatek.bean.Ligne_fact;
import com.mediatek.bean.Produit;
import com.mediatek.dao.FactureDao;
import com.mediatek.dao.Ligne_factDao;
import com.mediatek.dao.ProduitDao;
import com.mediatek.service.ClientService;
import com.mediatek.service.FactureService;

@Service
public class FactureServiceimpl implements FactureService {
	@Autowired
	private FactureDao factureDao;
	@Autowired
	private ClientService clientService;
	@Autowired
	private Ligne_factDao ligne_factDao;
	@Autowired
	private ProduitDao produitDao;

	@Override
	public Facture save(Facture facture) {
		Client client = clientService.findByEmailAndPassword(facture.getClient().getEmail(),
				facture.getClient().getPassword());
		factureDao.save(facture);
		if (client == null) {
			clientService.save(facture.getClient());
			client = facture.getClient();
		}
		for (Ligne_fact ligne_fact : facture.getLigne_factures()) {
		    if(ligne_fact.getProduit() != null) {
		    	Produit produit = produitDao.findBylibelle(ligne_fact.getProduit().getLibelle());
				if (produit == null) {
					produit = ligne_fact.getProduit();
					produitDao.save(produit);
				}
				ligne_fact.setProduit(produit);
				ligne_fact.setFacture(facture);
		    }
	
			ligne_factDao.save(ligne_fact);
		}
		facture.setClient(client);
		return factureDao.save(facture);
	}

	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return factureDao.findAll();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		Facture facture = factureDao.getOne(id);
		if (facture != null) {
			for (Ligne_fact ligne_fact : facture.getLigne_factures()) {
				ligne_factDao.deleteById(ligne_fact.getId());
			}
			factureDao.deleteById(id);
		}

	}

	@Override
	public Facture update(Long id, Facture facture) {
		// TODO Auto-generated method stub
		facture.setNum_fact(id);
		return factureDao.save(facture);
	}

}
