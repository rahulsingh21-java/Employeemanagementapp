package com.example.EmployeeManagement.jpaRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeManagement.model.EmployeePersonalDetail;

public interface EmployeeRepository extends JpaRepository<EmployeePersonalDetail, Integer> {


}
