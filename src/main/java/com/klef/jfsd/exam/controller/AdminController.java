package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Admin;
import com.klef.jfsd.exam.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
		@Autowired
		private AdminService adminService;
		
		@PostMapping("/login")
		public String login(@RequestParam String username,@RequestParam String email) {
			Admin admin=adminService.login(username,email);
			if(admin!=null) {
				return "Login Successful!";
			}else {
				return "Invalid credentials!";
			}
		}
}
