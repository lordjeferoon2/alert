package com.hacom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hacom.comapi.entities.Alert;
import com.hacom.services.AlertService;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertController {
    private final AlertService alertService;

    @Autowired
    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @GetMapping("/")
    public List<Alert> obtenerTodasLasAlertas() {
        return alertService.obtenerTodasLasAlertas();
    }

    @PostMapping("/")
    public Alert crearAlerta(@RequestBody Alert alerta) {
        return alertService.crearAlerta(alerta);
    }

}