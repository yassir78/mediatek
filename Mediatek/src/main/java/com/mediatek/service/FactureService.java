package com.mediatek.service;

import java.util.List;

import com.mediatek.bean.Facture;

public interface FactureService {
  public Facture save(Facture facture);
  public List<Facture> findAll();
  public void delete(Long id);
  public Facture update(Long id,Facture facture);
 }
