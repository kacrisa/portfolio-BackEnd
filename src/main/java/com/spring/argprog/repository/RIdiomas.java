package com.spring.argprog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.argprog.model.Idiomas;

@Repository
public interface RIdiomas extends JpaRepository <Idiomas, Integer> {

}
