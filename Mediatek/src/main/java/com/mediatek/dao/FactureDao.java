package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mediatek.bean.Facture;

@Repository
public interface FactureDao extends JpaRepository<Facture, Long> {
}
