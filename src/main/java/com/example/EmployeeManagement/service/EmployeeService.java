package com.example.EmployeeManagement.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.jpaRepository.EmployeeRepository;
import com.example.EmployeeManagement.model.EmployeePersonalDetail;
import com.example.EmployeeManagement.response.EmployeeResponse;

@Service
public class EmployeeService  {
	
	@Autowired
    private EmployeeRepository employeeRepo;
	
	@Autowired
    private ModelMapper mapper;
	
	public EmployeeResponse getEmployeeById(int id) {
        Optional<EmployeePersonalDetail> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }

}
