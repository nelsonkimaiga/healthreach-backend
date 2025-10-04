package com.healthreach.demo.service;


import com.healthreach.demo.models.Patient;
import com.healthreach.demo.models.PatientVisits;
import com.healthreach.demo.repository.PatientRepository;
import com.healthreach.demo.repository.PatientVisitsRepository;
import com.healthreach.demo.util.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PatientVisitsRepository patientVisitsRepository;

    @Override
    public Patient registerPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public PatientVisits saveVisit(PatientVisits patientVisits) {
        return patientVisitsRepository.save(patientVisits);
    }

    @Override
    public Iterable<Patient> fetchPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<PatientVisits> fetchVisits(String patientNumber) {
        List<PatientVisits> visits = patientVisitsRepository.findByPatientNumber(patientNumber);
        if (!visits.isEmpty()) {
            return visits;
        } else {
            throw new ResourceNotFoundException("Patient Visit not found with patientNumber: " + patientNumber);
        }
    }

}
