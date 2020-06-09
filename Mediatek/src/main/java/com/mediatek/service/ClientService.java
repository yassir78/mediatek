package com.mediatek.service;

import java.util.List;

import com.mediatek.bean.Client;

public interface ClientService {
	public Client findByNom(String nom);
	public List<Client> findAll();
	public Client save(Client client);
	public Client update(Long id,Client client);
	public void delete(Long id);
}
