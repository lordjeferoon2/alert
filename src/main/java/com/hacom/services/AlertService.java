package com.hacom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacom.comapi.entities.Alert;
import com.hacom.repositories.AlertRepository;

import java.util.List;

@Service
public class AlertService {

	private final AlertRepository alertRepository;
	
    @Autowired
    public AlertService(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    public List<Alert> obtenerTodasLasAlertas() {
        return alertRepository.findAll();
    }

    public Alert crearAlerta(Alert alert) {
        return alertRepository.save(alert);
    }
}
