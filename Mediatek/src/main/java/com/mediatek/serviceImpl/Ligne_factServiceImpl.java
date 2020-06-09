package com.mediatek.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Ligne_fact;
import com.mediatek.dao.Ligne_factDao;
import com.mediatek.service.Ligne_factService;

@Service
public class Ligne_factServiceImpl implements Ligne_factService{
 
  @Autowired
  private Ligne_factDao ligne_factDao;

@Override
public List<Ligne_fact> findAll() {
	return ligne_factDao.findAll();
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	
}
 
}
