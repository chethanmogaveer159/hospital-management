package com.hospital.hospitalmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospitalmanagement.Entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
