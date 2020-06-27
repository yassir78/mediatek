package com.mediatek.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediatek.bean.Audit_Stock;
import com.mediatek.service.Audit_StockService;

@RestController
@RequestMapping("mediatek-api/audit_stock")
@CrossOrigin
public class Audit_StockRest {
@Autowired
private Audit_StockService audit_StockService;
@DeleteMapping("/delete/{libelle}")
public void deleteByProduitLibelle(@PathVariable String libelle) {
	audit_StockService.deleteByProduitLibelle(libelle);
}
@GetMapping("/")
public List<Audit_Stock> findAll() {
	return audit_StockService.findAll();
}

}
