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

import com.mediatek.bean.Facture;
import com.mediatek.service.FactureService;

@RestController
@RequestMapping("mediatek-api/facture")
@CrossOrigin
public class FactureRest {
@Autowired
private FactureService factureService;
@PutMapping("/id/{id}")
public Facture update(@PathVariable Long id,@RequestBody Facture facture) {
	return factureService.update(id, facture);
}
@DeleteMapping("/id/{id}")
public void delete(@PathVariable Long id) {
	factureService.delete(id);
}
@GetMapping("/")
public List<Facture> findAll() {
	return factureService.findAll();
}
@PostMapping("/")
public Facture save(@RequestBody Facture facture) {
	return factureService.save(facture);
}

}
