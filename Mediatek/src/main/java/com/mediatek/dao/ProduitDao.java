package com.mediatek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mediatek.bean.Produit;

public interface ProduitDao  extends JpaRepository<Produit, Long> {
  public Produit findBylibelle(String libelle);
  public int deleteBylibelle(String libelle);
  @Query(value = "select demande(:num_prod) from dual",nativeQuery = true)
  public String demande(@Param(value = "num_prod") Long num_prod);
  
  
  
}
