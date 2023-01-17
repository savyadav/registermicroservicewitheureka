package com.infybuzz.cloud.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infybuzz.cloud.departmentservice.response.DepartmentResponse;
import com.infybuzz.cloud.departmentservice.service.DepartmentService;




@RestController
@RequestMapping("/api/department")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;

	@GetMapping("/message")
	public String getMessage() {
		return "departmentservice";
	}
	
	@GetMapping("/getById/{id}")
	public DepartmentResponse getById(@PathVariable long id) {
		return departmentService.getById(id);
	}
}
