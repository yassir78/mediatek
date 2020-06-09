package com.mediatek.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediatek.bean.Audit_Stock;
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

}
