package com.spring.argprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.argprog.model.Persona;

@Repository
public interface RPersona  extends JpaRepository <Persona, Long> {

}
