package com.sadic.myfastfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sadic.myfastfood.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {

}
