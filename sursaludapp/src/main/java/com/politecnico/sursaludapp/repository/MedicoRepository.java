package com.politecnico.sursaludapp.repository;

import com.politecnico.sursaludapp.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}