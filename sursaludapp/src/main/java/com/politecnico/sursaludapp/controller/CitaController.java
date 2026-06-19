package com.politecnico.sursaludapp.controller;

import com.politecnico.sursaludapp.model.Cita;
import com.politecnico.sursaludapp.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaService citaService;

    // OBTENER TODAS LAS CITAS
    @GetMapping
    public List<Cita> listar() {
        return citaService.listar();
    }

    // CREAR UNA CITA
    @PostMapping
    public Cita guardar(@RequestBody Cita cita) {
        return citaService.guardar(cita);
    }

    // CANCELAR UNA CITA
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        citaService.eliminar(id);
    }
}