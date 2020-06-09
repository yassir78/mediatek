package com.mediatek.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediatek.bean.Audit_Stock;
import com.mediatek.service.Audit_StockService;

@RestController
@RequestMapping("mediatek-api/audit_stock")
public class Audit_StockRest {
@Autowired
private Audit_StockService audit_StockService;
@GetMapping("/")
public List<Audit_Stock> findAll() {
	return audit_StockService.findAll();
}

}
