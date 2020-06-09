package com.mediatek.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Chiffre;
import com.mediatek.dao.ChiffreDao;
import com.mediatek.service.ChiffreService;
@Service
public class ChiffreServiceImpl implements ChiffreService {
 @Autowired
 private ChiffreDao chiffreDao;


@Override
public List<Chiffre> findAll() {
	// TODO Auto-generated method stub
	return chiffreDao.findAll();
}


@Override
public Chiffre findByNumC(Long numC) {
	// TODO Auto-generated method stub
	return chiffreDao.findByNumC(numC);
}


@Override
public Chiffre findByNom(String nom) {
	// TODO Auto-generated method stub
	return chiffreDao.findByNom(nom);
}





}
