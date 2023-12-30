package com.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.entity.Registration;

public interface registrationRepository extends JpaRepository<Registration, Long>{

}
