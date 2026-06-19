package com.politecnico.sursaludapp.service;

import com.politecnico.sursaludapp.model.Cita;
import com.politecnico.sursaludapp.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    // OBTENER TODAS LAS CITAS
    public List<Cita> listar() {
        return citaRepository.findAll();
    }

    // GUARDAR UNA CITA
    public Cita guardar(Cita cita) {
        return citaRepository.save(cita);
    }

    // ELIMINAR UNA CITA
    public void eliminar(Long id) {
        citaRepository.deleteById(id);
    }
}