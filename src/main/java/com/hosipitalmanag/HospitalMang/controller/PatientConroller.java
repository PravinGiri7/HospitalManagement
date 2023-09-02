package com.hosipitalmanag.HospitalMang.controller;

//import java.util.ArrayList; 
import java.util.List;

//import org.hibernate.Criteria;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hosipitalmanag.HospitalMang.entity.Patient;
import com.hosipitalmanag.HospitalMang.service.PatientService;

@RestController
public class PatientConroller {

	

	
	@Autowired
	PatientService service;
	
	
	//api-1 get by all 
	@GetMapping("/patientlist")
	public List<Patient> getPatient(){
		return service.getPatient();
	}
	//api-2
	@GetMapping("/getid/{id}")
	public List<Patient> getByid(@PathVariable int id){
		return service.getByid(id);
		
	}
	
	//api-3
	
	@GetMapping("/getname/{name}")
	public List<Patient> getByname(@PathVariable String name){
		return service.getByname(name);
	}
	
	
	
	//api-4
	@GetMapping("/getcity/{city}")
	public List<Patient> getByCity(@PathVariable String city){
		return service.getByCity(city);
		
	}
	
	//api-5
	@PostMapping("/add")
	public String insertPatient(@RequestBody List<Patient> pl) {
		return  service.insertPatient(pl);
		
	}

//api-6
	@DeleteMapping("removeid/{id}")
	public String deletePatient(@PathVariable int id) {
		return service.deletePatient(id);
	}

	
	//api-7
	@PutMapping("update/")
	public  String UpdatePatient(@RequestBody String name) {
		System.out.println(name);
		String msg=service.UpdatePatient(name);
		
		return msg;
		
	}
	
	//api-7
	
	@GetMapping("/insertpatien")
	public String insertSinglePatient(@RequestBody  Patient p) {
		return service.insertSinglePatient(p);
		
	}
	
	
}
