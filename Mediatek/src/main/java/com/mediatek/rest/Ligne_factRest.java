package com.mediatek.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mediatek.bean.Ligne_fact;
import com.mediatek.service.Ligne_factService;

@RestController
@RequestMapping("mediatek-api/ligne_fact")
public class Ligne_factRest {
@Autowired 
Ligne_factService ligne_factService;
@GetMapping("/")
public List<Ligne_fact> findAll() {
	return ligne_factService.findAll();
}
}
