package com.mediatek.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Client;
import com.mediatek.dao.ClientDao;
import com.mediatek.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;

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
		 clientDao.deleteById(id);
	}

	@Override
	public Client findByEmailAndPassword(String email, String password) {
		
		return clientDao.findByEmailAndPassword(email, password);
	}

}
