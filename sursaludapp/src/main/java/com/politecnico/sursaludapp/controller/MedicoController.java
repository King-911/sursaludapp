package com.politecnico.sursaludapp.controller;

import com.politecnico.sursaludapp.model.Medico;
import com.politecnico.sursaludapp.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    // OBTENER TODOS LOS MEDICOS
    @GetMapping
    public List<Medico> listar() {
        return medicoService.listar();
    }

    // CREAR UN MEDICO
    @PostMapping
    public Medico guardar(@RequestBody Medico medico) {
        return medicoService.guardar(medico);
    }
}