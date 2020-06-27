package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mediatek.bean.Facture;

@Repository
@CrossOrigin
public interface FactureDao extends JpaRepository<Facture, Long> {
}
