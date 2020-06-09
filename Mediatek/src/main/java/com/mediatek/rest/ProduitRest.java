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

import com.mediatek.bean.Produit;
import com.mediatek.service.ProduitService;

@RestController
@RequestMapping("mediatek-api/produit")
public class ProduitRest {
@Autowired
private ProduitService produitService;
@GetMapping("/num_prod/{num_prod}")
public String demande(@PathVariable Long num_prod) {
	return produitService.demande(num_prod);
}
@DeleteMapping("id/{id}")
public void delete(@PathVariable Long id) {
	produitService.delete(id);
}
@PutMapping("id/{id}")
public Produit update(@PathVariable Long id,@RequestBody Produit produit) {
	return produitService.update(id, produit);
}
@GetMapping("/libelle/{libelle}")
public Produit findBylibelle(@PathVariable String libelle) {
	return produitService.findBylibelle(libelle);
}
@DeleteMapping("/libelle/{libelle}")
public void deleteBylibelle(@PathVariable String libelle) {
	produitService.deleteBylibelle(libelle);
}
@PostMapping("/")
public Produit save(@RequestBody Produit produit) {
	return produitService.save(produit);
}
@GetMapping("/")
public List<Produit> findAll() {
	return produitService.findAll();
}
}
