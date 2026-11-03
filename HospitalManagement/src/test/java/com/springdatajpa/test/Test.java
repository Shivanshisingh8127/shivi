package com.springdatajpa.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.entity.Patient;
import com.springdatajpa.repository.PatientRepository;

@SpringBootTest
public class TestPatient {

    @Autowired
    private PatientRepository pr;

    @Test
    public void getAllPatients() {

        List<Patient> list = pr.findAll();

        System.out.println("Total Records = " + list.size());

        for(Patient p : list) {
            System.out.println(p);
        }
    }
}