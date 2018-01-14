package com.anjeludo.microservicios.businesslogicapi.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anjeludo.microservicios.businesslogicapi.model.FizzBuzz;

public interface FizzBuzzRepository extends JpaRepository<FizzBuzz, Long> {

    Set<FizzBuzz> findByIsFizzBuzz(Boolean isFizzBuzz);

}
