package com.klef.jfsd.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.model.Admin;

@Repository
public interface  AdminRepository extends JpaRepository<Admin,String>{
	Admin findByUsernameAndEmail(String username,String email);
}
