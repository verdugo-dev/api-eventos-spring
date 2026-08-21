package com.gestion.eventos.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.eventos.api.domain.Role;
import com.gestion.eventos.api.domain.User;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<User> findByUsername(String username);
}
