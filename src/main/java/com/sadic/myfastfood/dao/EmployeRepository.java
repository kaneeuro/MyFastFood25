package com.sadic.myfastfood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sadic.myfastfood.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
