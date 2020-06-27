package com.mediatek.service;

import java.util.List;

import com.mediatek.bean.Audit_Stock;

public interface Audit_StockService {
  public List<Audit_Stock> findAll();
  public void deleteByProduitLibelle(String libelle);
}
