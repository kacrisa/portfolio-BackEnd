package com.spring.argprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.argprog.model.Educacion;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer> {

}
