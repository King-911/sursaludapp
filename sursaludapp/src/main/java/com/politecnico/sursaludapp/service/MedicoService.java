package com.politecnico.sursaludapp.service;

import com.politecnico.sursaludapp.model.Medico;
import com.politecnico.sursaludapp.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    // OBTENER TODOS LOS MEDICOS
    public List<Medico> listar() {
        return medicoRepository.findAll();
    }

    // GUARDAR UN MEDICO
    public Medico guardar(Medico medico) {
        return medicoRepository.save(medico);
    }

    // ELIMINAR UN MEDICO
    public void eliminar(Long id) {
        medicoRepository.deleteById(id);
    }
}
