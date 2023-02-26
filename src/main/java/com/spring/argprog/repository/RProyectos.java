package com.spring.argprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.argprog.model.Proyectos;

@Repository
public interface RProyectos extends JpaRepository <Proyectos, Integer> {

}
