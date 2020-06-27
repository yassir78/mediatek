package com.mediatek.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Client;
import com.mediatek.bean.Facture;
import com.mediatek.dao.ClientDao;
import com.mediatek.dao.FactureDao;
import com.mediatek.dao.Ligne_factDao;
import com.mediatek.service.ClientService;
import com.mediatek.service.FactureService;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;
	@Autowired
	FactureService factureService;

	@Override
	public Client findByNom(String nom) {
		// TODO Auto-generated method stub
		return clientDao.findByNom(nom);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientDao.findAll();
	}

	@Override
	public Client save(Client client) {
		return clientDao.save(client);
	}

	@Override
	public Client update(Long id, Client client) {
		// TODO Auto-generated method stub
		client.setNum_cli(id);

		return clientDao.save(client);

	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		 Client client = clientDao.getOne(id);
		 if(client != null) {
			 if(client.getFactures() != null) {
				 for (Facture facture : client.getFactures()) {
					factureService.delete(facture.getNum_fact());
				}
			 }
			 clientDao.deleteById(client.getNum_cli()); 
		 }
		 
	}

	@Override
	public Client findByEmailAndPassword(String email, String password) {
		
		return clientDao.findByEmailAndPassword(email, password);
	}

	@Override
	public List<Client> findByrole(String role) {
		// TODO Auto-generated method stub
		return clientDao.findByrole(role);
	}

	@Override
	public Client findByNumCLi(Long numCli) {
		// TODO Auto-generated method stub
     	System.out.println("////////////////////////////////////////////");
		Client client = clientDao.getOne(numCli);
		System.out.println(client);
		System.out.println("////////////////////////////////////////////");
		
		return client;
	}

	@Override
	public Client findByEmailAndNomAndPrenom(String email, String nom, String prenom) {
		// TODO Auto-generated method stub
		return clientDao.findByEmailAndNomAndPrenom(email, nom, prenom);
	}



}
