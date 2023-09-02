package com.hosipitalmanag.HospitalMang.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.dialect.Teradata14Dialect;
import org.hibernate.query.criteria.internal.expression.SearchedCaseExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.hosipitalmanag.HospitalMang.entity.Patient;

import java.util.List;
//import java.util.list;

@Repository
public class PatientDao {

@Autowired
SessionFactory sf;

 public List<Patient> getPatient() {
	 
	 Session session=sf.openSession();
	 Criteria criteria = session.createCriteria(Patient.class);
	 return criteria.list();
	  
 }

 
 //get operation by list 
 public  String insertPatient(List<Patient> pl) {
	  
	  System.out.println("In dao"+pl);
	
	  Session session =sf.openSession();
	  Transaction tr =session.beginTransaction();
	  for (Patient patient : pl) {
	session.save(patient);
	
} tr.commit();
session.close();
	 
	  return "Patient Saved Successfully";
	  
	  
	}
 
 
 
 
 // insert patient  indually 
 
 public String insertSinglePatient(Patient p) {
	 
	 Session session = sf.openSession();
	 Transaction  tr=session.beginTransaction();
	 session.save(p);
	 tr.commit();
	 
	 return " patient add SuccessFully.....!";
 }
 
 
 
 //get operation by id
 
 public  List<Patient> getByid(int id) {
	 Session session=sf.openSession();
	 Criteria cr=session.createCriteria(Patient.class);
	 cr.add(Restrictions.eq("patientid", id));
	List<Patient> list=cr.list();
	 return list;
	 
	 
 }
 //getbyname
 public List<Patient> getByName(String name){
	 
	 Session session=sf.openSession();
	 Criteria cr=session.createCriteria(Patient.class);
	 cr.add(Restrictions.eq("name", name));
	 List<Patient> list=cr.list();
	 return list;
	 
}
 
 
 //getbycity
 public List<Patient> getByCity(String city){
	 Session session=sf.openSession();
	 Criteria cr=session.createCriteria(Patient.class);
	 cr.add(Restrictions.eq("city", city));
	 List<Patient> list=cr.list();
	 return list;
	 
	 
	 
 }
 
 //delete operationby id
  public String deletePatient(int id) {
	  
	  Session session= sf.openSession();
	  Transaction tr=session.beginTransaction();
	  Patient pt = session.get(Patient.class, id);
	  {
	  session.delete(pt);
	  }
	tr.commit();
	return "Patient Deleted successfully";
  }
	
	//to update 
	public String   UpdatePatient(String name) {
		Session session= sf.openSession();
		Transaction tr =session.beginTransaction();
		Patient pat =session.get(Patient.class,name);
		{
		
			session.update(pat);

		}
				
		
	return " Patient Updated Successfully........ "; 
	}
	  
	
	
	
	
  }
 
 
 
	  
	  

	
	
	

	
	
	
	
