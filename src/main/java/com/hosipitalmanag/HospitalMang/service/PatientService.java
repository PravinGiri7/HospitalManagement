package com.hosipitalmanag.HospitalMang.service;

import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.hosipitalmanag.HospitalMang.dao.PatientDao;
import com.hosipitalmanag.HospitalMang.entity.Patient;





@Component
public class PatientService {
	
	
	
	
	@Autowired
	PatientDao dao;
	
	
	//getoperation by all patient
	public List<Patient> getPatient() {
		return dao.getPatient();
		
		
		
		
	}
	
	
	
	
	//get by id 
	public List<Patient> getByid(int id){
		return dao.getByid(id);
	}
	//get by name 
	public List<Patient>getByname(String name){
		return dao.getByName(name);
	}
	
	//getby city
	public List<Patient> getByCity(String city){
		return dao.getByCity(city);
	}
	
	
	
	//insert operation 
   public String insertPatient(List<Patient> pl) {
	   
	  String msg=dao.insertPatient(pl);
	  return msg;
	  
	   
	   
   }
	

	public String deletePatient(int id){
		String msg=dao.deletePatient(id);
		return msg;
		
		
	}
	
	
	
	//udate 
	public String UpdatePatient(String name) {
		String msg=dao.UpdatePatient(name);
		return msg;
		
	}
	
	public String insertSinglePatient(Patient p) {
		return dao.insertSinglePatient(p);
	}
	
	
	
	
	
}
