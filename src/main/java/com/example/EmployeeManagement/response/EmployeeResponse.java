package com.example.EmployeeManagement.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
	
	String EmpName;
    int EmpPhoneNo;
    String address;
    String Qualification; 

}
