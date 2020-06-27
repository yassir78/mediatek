package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mediatek.bean.Ligne_fact;
@Repository
@CrossOrigin
public interface Ligne_factDao extends JpaRepository<Ligne_fact, Long> {

}
