package com.daham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.daham.entyty.Depertment;
import com.daham.service.DepertmentService;

@RestController
public class DepertmentController {

	@Autowired
	private DepertmentService depertmentService;

	@PostMapping("/depertments") // write to data base
	public Depertment saveDep(@RequestBody Depertment depertment) {

		return depertmentService.saveDepartment(depertment);

	}

	// read from data base
	@GetMapping("/depertments")
	public List<Depertment> getDeps() {
		return depertmentService.getDepertents();

	}

	// read from data base by Id
	@GetMapping("/depertments/{id}")
	public Depertment fetchDepartmentById(@PathVariable("id") Long id) {
		return depertmentService.fetchDepartmentById(id);
	}

	@DeleteMapping("/depertments/{id}")
	public String deletDepartmentById(@PathVariable("id") Long id) {
		depertmentService.deletDepartmentById(id);
		return "Department deleted sus... ";

	}

	@PutMapping("/depertments/{id}")
	public Depertment updateDepartmetn(@PathVariable("id") Long id, @RequestBody Depertment depertment) {
		return depertmentService.updateDepartmetn(id, depertment);
	}

}
