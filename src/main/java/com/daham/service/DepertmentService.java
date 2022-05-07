package com.daham.service;

import java.util.List;

import com.daham.entyty.Depertment;

public interface DepertmentService {

	public Depertment saveDepartment(Depertment depertment);

	public List<Depertment> getDepertents();

	public Depertment fetchDepartmentById(Long departmentId);

	public void deletDepartmentById(Long id);

	public Depertment updateDepartmetn(Long id, Depertment depertment);



}
