package com.example.Placementmanagementdemoprogram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Placementmanagementdemoprogram.entity.Admin;
import com.example.Placementmanagementdemoprogram.service.Adminservice;

@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:3000"})
@RestController
public class Admincontroller {
	

		@Autowired
		private Adminservice adminservice;

		@PostMapping("/saveadmin")
		public Admin registeradmin(@RequestBody Admin a) {
			return adminservice.registeradmin(a);
		}

		@GetMapping("/getadmin")
		public List<Admin> getadmin() {
			return adminservice.getadmins();
		}

		@GetMapping("/getadmin/{id}")
		public Admin getadminbyid(@PathVariable("id") Long id) {
			return adminservice.getadminbyid(id);
		}

		@PutMapping("/updateadmin/{id}")
		public Admin updateadmin(@PathVariable("id") Long id, @RequestBody Admin a) {
			return adminservice.updateadmin(id, a);
		}

		@DeleteMapping("/deleteadmin/{id}")
		public String deleteadmin(@PathVariable("id") Long id) {
			return adminservice.deleteadmin(id);
		}
	}
