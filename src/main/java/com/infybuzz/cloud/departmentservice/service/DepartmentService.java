package com.infybuzz.cloud.departmentservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infybuzz.cloud.departmentservice.entity.Department;
import com.infybuzz.cloud.departmentservice.repository.DepartmentRepository;
import com.infybuzz.cloud.departmentservice.response.DepartmentResponse;


@Service
public class DepartmentService {
Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
	DepartmentRepository departmentRepository;

	
	public DepartmentResponse getById (long id) {
		
		logger.info("Inside getById " + id);
		
		Department department = departmentRepository.findById(id).get();
		
		return new DepartmentResponse(department);
	}
	
}



