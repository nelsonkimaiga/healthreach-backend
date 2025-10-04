package com.healthreach.demo.controller;


import com.healthreach.demo.models.Patient;
import com.healthreach.demo.models.PatientVisits;
import com.healthreach.demo.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.http.MediaType.ALL_VALUE;


@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "healthreach", produces = "application/json")
public class PatientController {

    @Autowired
    PatientService patientService;
    
    
    @PostMapping(path = "/register", consumes = ALL_VALUE)
    public ResponseEntity<Patient> registerPatient(@Valid @RequestBody Patient patient) {
        return ResponseEntity.status(HttpStatus.CREATED).body(patientService.registerPatient(patient));
    }
    
    
    @PostMapping(path = "/save-visit", consumes = ALL_VALUE)
    public ResponseEntity<PatientVisits> saveVisit(@Valid @RequestBody PatientVisits patientVisits) {
        return ResponseEntity.status(HttpStatus.CREATED).body(patientService.saveVisit(patientVisits));
    }
    
    @GetMapping(path = "/fetch-patients", consumes = ALL_VALUE)
    public ResponseEntity<Iterable<Patient>> fetchPatients() {
        return ResponseEntity.status(HttpStatus.FOUND).body(patientService.fetchPatients());
    }
    
    @GetMapping(path = "/visits/{patientNumber}", consumes = ALL_VALUE)
    public ResponseEntity<List<PatientVisits>> getPatientVisits(@PathVariable String patientNumber) {
        return ResponseEntity.status(HttpStatus.FOUND).body(patientService.fetchVisits(patientNumber));
    }
}
