package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Admin;
import com.klef.jfsd.exam.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRespository;
	
	public Admin addAdmin(Admin admin) {
		return adminRespository.save(admin);
	}
	
	public Admin login(String username,String email) {
		return adminRespository.findByUsernameAndEmail(username,email);
	}
}
