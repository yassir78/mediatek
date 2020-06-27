package com.mediatek.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Audit_Stock;
import com.mediatek.bean.Produit;
import com.mediatek.dao.Audit_StockDao;
import com.mediatek.service.Audit_StockService;
@Service
public class Audit_StockServiceImpl implements Audit_StockService{
@Autowired
private Audit_StockDao audit_StockDao;
	@Override
	public List<Audit_Stock> findAll() {
		// TODO Auto-generated method stub
		return audit_StockDao.findAll();
	}
	@Override
	public void deleteByProduitLibelle(String libelle) {
		// TODO Auto-generated method stub
		List<Audit_Stock> audit_stock = audit_StockDao.findAll();
		if(audit_stock != null) {
			for (Audit_Stock audit_Stock1 : audit_stock) {
				if(audit_Stock1.getNum_prod().getLibelle().equals(libelle)) {
					audit_StockDao.deleteById(audit_Stock1.getId());
				}
			}
		}
	}

}
