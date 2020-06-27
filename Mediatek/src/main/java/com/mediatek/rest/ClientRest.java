package com.mediatek.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class ClientRest {
@Autowired
private ClientService clientService;
@GetMapping("/email/{email}/nom/{nom}/prenom/{prenom}")
public Client findByEmailAndNomAndPrenom(@PathVariable String email,@PathVariable String nom,@PathVariable String prenom) {
	return clientService.findByEmailAndNomAndPrenom(email, nom, prenom);
}
@GetMapping("/id/{id}")
public Client findByNumCLi(@PathVariable Long id) {
	return clientService.findByNumCLi(id);
}
@GetMapping("/role/{role}")
public List<Client> findByrole(@PathVariable String role) {
	return clientService.findByrole(role);
}
@GetMapping("/email/{email}/password/{password}")
public Client findByEmailAndPassword(@PathVariable String email,@PathVariable String password) {
	return clientService.findByEmailAndPassword(email, password);
}
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
