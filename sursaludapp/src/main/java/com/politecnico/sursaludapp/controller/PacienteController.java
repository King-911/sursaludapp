package com.politecnico.sursaludapp.controller;

import com.politecnico.sursaludapp.model.Paciente;
import com.politecnico.sursaludapp.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    // OBTENER TODOS LOS PACIENTES
    @GetMapping
    public List<Paciente> listar() {
        return pacienteService.listar();
    }

    // CREAR UN PACIENTE
    @PostMapping
    public Paciente guardar(@RequestBody Paciente paciente) {
        return pacienteService.guardar(paciente);
    }
}