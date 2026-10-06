package com.example.Placementmanagementdemoprogram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Placementmanagementdemoprogram.entity.Admin;
import com.example.Placementmanagementdemoprogram.repository.Adminrepo;

@Service
public class Adminservice {

	@Autowired
	private Adminrepo ar;

	//create
	public Admin registeradmin(Admin a) {
		return ar.save(a);
	}

	//read all
	public List<Admin> getadmins() {
		return (List<Admin>) ar.findAll();
	}

	//read one
	public Admin getadminbyid(Long id) {
		return ar.findById(id).orElse(null);
	}

	//update
	public Admin updateadmin(Long id, Admin a) {
		Admin existing = ar.findById(id).orElse(null);
		if (existing == null) {
			return null;
		}
		existing.setName(a.getName());
		existing.setPassword(a.getPassword());
		return ar.save(existing);
	}

	//delete
	public String deleteadmin(Long id) {
		if (!ar.existsById(id)) {
			return "Admin not found";
		}
		ar.deleteById(id);
		return "Deleted successfully";
	}
}
