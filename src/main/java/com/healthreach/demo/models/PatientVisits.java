package com.healthreach.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class PatientVisits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date visitDate;
    @Column
    String patientNumber;
    @Column
    String patientName;
    @Column
    String bmiStatus;
    @Column
    String age;
    @Column
    String healthStatus;
    @Column
    String takingDrugs;

    @Column
    Boolean isDieting;

}
