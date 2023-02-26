package com.spring.argprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.argprog.model.Habilidades;

@Repository
public interface RHabilidades extends JpaRepository <Habilidades, Integer> {

}
