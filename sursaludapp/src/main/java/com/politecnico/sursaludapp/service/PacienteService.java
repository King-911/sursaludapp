package com.politecnico.sursaludapp.service;

import com.politecnico.sursaludapp.model.Paciente;
import com.politecnico.sursaludapp.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    // OBTENER TODOS LOS PACIENTES
    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }

    // GUARDAR UN PACIENTE
    public Paciente guardar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    // ELIMINAR UN PACIENTE
    public void eliminar(Long id) {
        pacienteRepository.deleteById(id);
    }
}