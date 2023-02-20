package com.spring.argprog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.argprog.model.Experiencia;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {

}
