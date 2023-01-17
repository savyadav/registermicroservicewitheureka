package com.infybuzz.cloud.departmentservice.response;

import com.infybuzz.cloud.departmentservice.entity.Department;

public class DepartmentResponse {
	private long departmentId;
	private String name;

	private String code;
	public DepartmentResponse(Department department ) {
		super();
		this.departmentId = department.getId();
		this.name = department.getName();
		this.code = department.getCode();
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
}
