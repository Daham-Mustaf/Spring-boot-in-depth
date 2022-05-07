package com.daham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daham.entyty.Depertment;
@Repository
public interface DepartmentRepository extends JpaRepository<Depertment, Long> {

}
