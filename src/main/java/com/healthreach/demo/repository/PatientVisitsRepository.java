package com.healthreach.demo.repository;

import com.healthreach.demo.models.PatientVisits;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientVisitsRepository extends CrudRepository<PatientVisits, Long> {

    @Query("SELECT p FROM PatientVisits p WHERE p.patientNumber = :patientNumber")
    List<PatientVisits> findByPatientNumber(@Param("patientNumber") String patientNumber);

}
