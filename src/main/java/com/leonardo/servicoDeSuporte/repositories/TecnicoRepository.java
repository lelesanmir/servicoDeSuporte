package com.leonardo.servicoDeSuporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.servicoDeSuporte.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
