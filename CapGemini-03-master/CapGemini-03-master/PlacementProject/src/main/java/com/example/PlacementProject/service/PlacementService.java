package com.example.PlacementProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PlacementProject.entity.Placement;
import com.example.PlacementProject.repository.PlacementRepo;
import java.util.List;
@Service
public class PlacementService {
	
	@Autowired
	private PlacementRepo pr;

	// create
	public Placement registerPlacement(Placement p) {
		return pr.save(p);
	}

	// read
	public List<Placement> getPlacements() {
		return (List<Placement>) pr.findAll();
	}

	// update
	public Placement updatePlacement(Long id, Placement p) {
		p.setId(id);
		return pr.save(p); // save() updates when the id already exists
	}

	// delete
	public void deletePlacement(Long id) {
		pr.deleteById(id);
	}


}
