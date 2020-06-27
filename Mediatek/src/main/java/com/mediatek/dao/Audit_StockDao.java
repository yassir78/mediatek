package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mediatek.bean.Audit_Stock;
@Repository
@CrossOrigin
public interface Audit_StockDao extends JpaRepository<Audit_Stock,Long > {
	
}
