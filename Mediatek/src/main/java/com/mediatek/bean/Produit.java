package com.mediatek.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long num_prod;
	private String libelle;
	private double prix;
	private int stock;
	@OneToMany(mappedBy = "produit")
	@JsonProperty(access = Access.WRITE_ONLY)
    private List<Ligne_fact> ligne_factures;
}
