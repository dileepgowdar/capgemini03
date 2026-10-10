package com.example.PlacementProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PlacementProject.entity.Placement;
import com.example.PlacementProject.service.PlacementService;
import java.util.List;

@RestController
public class PlacementController {

	@Autowired
	private PlacementService ps;

	@PostMapping("/saveplacement")
	public Placement registerPlacement(@RequestBody Placement p) {
		return ps.registerPlacement(p);
	}

	@GetMapping("/getplacement")
	public List<Placement> getPlacements() {
		return ps.getPlacements();
	}

	@PutMapping("/updateplacement/{id}")
	public Placement updatePlacement(@PathVariable("id") Long id, @RequestBody Placement p) {
		return ps.updatePlacement(id, p);
	}

	@DeleteMapping("/deleteplacement/{id}")
	public void deletePlacement(@PathVariable("id") Long id) {
		ps.deletePlacement(id);
	}
}