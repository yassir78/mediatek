package com.mediatek.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediatek.bean.Client;
import com.mediatek.service.ClientService;

@RestController
@RequestMapping("mediatek-api/client")
public class ClientRest {
@Autowired
private ClientService clientService;
@DeleteMapping("/id/{id}")
public void delete(@PathVariable Long id) {
	clientService.delete(id);
}
@PutMapping("/num/{id}")
public Client update(@PathVariable Long id,@RequestBody Client client) {
	return clientService.update(id, client);
}
@PostMapping("/")
public Client save(@RequestBody Client client) {
	return clientService.save(client);
}
@GetMapping("/nom/{nom}")
public Client findByNom(@PathVariable String nom) {
	return clientService.findByNom(nom);
}
@GetMapping("/")
public List<Client> findAll() {
	return clientService.findAll();
}
}
