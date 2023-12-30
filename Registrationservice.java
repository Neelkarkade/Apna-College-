package com.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.Registration;
import com.webapp.repository.registrationRepository;

@Service
public class Registrationservice {
    @Autowired
	private registrationRepository rpo;

	public void SaveRegistration(Registration reg) {
		rpo.save(reg);		
	}

	public void DeleteReg(long id) {
		rpo.deleteById(id);
	}

	public List<Registration> ListReg() {
		List<Registration> findAll = rpo.findAll();
		return findAll;
	}

	public Registration getRegistration(long id) {
		Registration registration = rpo.findById(id).get();		
		return registration;
	}

	public void updateReg(Registration reg) {
         rpo.save(reg);		
	}
}
