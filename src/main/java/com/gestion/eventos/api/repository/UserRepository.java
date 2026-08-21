package com.gestion.eventos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.eventos.api.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
