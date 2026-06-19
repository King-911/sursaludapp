package com.politecnico.sursaludapp.repository;

import com.politecnico.sursaludapp.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
