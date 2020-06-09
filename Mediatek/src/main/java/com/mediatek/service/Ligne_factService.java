package com.mediatek.service;

import java.util.List;

import com.mediatek.bean.Ligne_fact;

public interface Ligne_factService {
public List<Ligne_fact> findAll();
public void delete(Long id);
}
