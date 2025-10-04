package com.healthreach.demo.service;


import com.healthreach.demo.models.Patient;
import com.healthreach.demo.models.PatientVisits;

import java.util.List;

public interface PatientService {

    Patient registerPatient(Patient patient);

    PatientVisits saveVisit(PatientVisits patientVisits);
    Iterable<Patient> fetchPatients();

    List<PatientVisits> fetchVisits(String patientNumber);
}
