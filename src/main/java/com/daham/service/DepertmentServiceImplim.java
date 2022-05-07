package com.daham.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daham.entyty.Depertment;
import com.daham.repository.DepartmentRepository;

@Service
public class DepertmentServiceImplim implements DepertmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Depertment saveDepartment(Depertment depertment) {

		return departmentRepository.save(depertment);
	}

	@Override
	public List<Depertment> getDepertents() {
		// read from data base
		return departmentRepository.findAll();
	}

	@Override
	public Depertment fetchDepartmentById(Long departmentId) {
		Optional<Depertment> depertmentRespons = departmentRepository.findById(departmentId);
		Depertment depertment = null;
		if (depertmentRespons.isPresent()) {
			depertment = depertmentRespons.get();
		} else {
			throw new RuntimeException("No record found for given id: " + departmentId);
		}

		return depertment;
	}

	@Override
	public void deletDepartmentById(Long id) {
		Optional<Depertment> depertmentRespons = departmentRepository.findById(id);
		if (depertmentRespons.isPresent()) {
			departmentRepository.deleteById(depertmentRespons.get().getDepertmentId());
		} else {
			throw new RuntimeException("No record found for given id: " + id);
		}

	}

	@Override
	public Depertment updateDepartmetn(Long id, Depertment depertment) {
		Depertment depertmenDB = departmentRepository.findById(id).get();
		// check nun Null and nun Blanck.
		if (Objects.nonNull(depertment.getDepertmentName()) && !"".equalsIgnoreCase(depertment.getDepertmentName())) {
			depertmenDB.setDepertmentName(depertment.getDepertmentName());
		}
		if (Objects.nonNull(depertment.getDepertmentCod()) && !"".equalsIgnoreCase(depertment.getDepertmentCod())) {
			depertmenDB.setDepertmentCod(depertment.getDepertmentCod());
		}
		if (Objects.nonNull(depertment.getDepertmentAddress())
				&& !"".equalsIgnoreCase(depertment.getDepertmentAddress())) {
			depertmenDB.setDepertmentAddress(depertment.getDepertmentAddress());
		}
		return departmentRepository.save(depertmenDB);
	}

}
