package com.mkraskiewicz.repository;

import com.mkraskiewicz.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {


    Optional<Authority> findByName(String name);
}
