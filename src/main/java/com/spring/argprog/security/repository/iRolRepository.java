package com.spring.argprog.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.argprog.security.entity.Rol;
import com.spring.argprog.security.enums.RolNombre;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
