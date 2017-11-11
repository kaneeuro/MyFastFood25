package com.sadic.myfastfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sadic.myfastfood.entities.Comptable;

public interface ComptableRepository extends JpaRepository<Comptable, Long> {

}
