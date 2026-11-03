package com.springdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.entity.Patient;
import com.springdatajpa.repository.PatientRepository;
@Service
public class PatientService {
	@Autowired
	private PatientRepository pr;
	
	
//	get all patients
	public void getAllPatients(){
		 List<Patient>  list =pr.findAll();
		 System.out.println(list);
	}

}
