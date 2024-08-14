package com.leonardo.servicoDeSuporte.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.servicoDeSuporte.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>  {

}
