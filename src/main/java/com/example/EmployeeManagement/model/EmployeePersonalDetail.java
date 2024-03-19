package com.example.EmployeeManagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeePersonalDetail {
	
	@Id
    @GeneratedValue
	int EmpId;
    String EmpName;
    int EmpPhoneNo;
    String address;
    String Qualification; 
    
    
  
  

}
