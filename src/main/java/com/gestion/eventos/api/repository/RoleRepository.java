package com.gestion.eventos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.eventos.api.domain.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {

}
