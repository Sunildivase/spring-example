package com.employeeManagement.service;

import com.employeeManagement.model.Employee;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@Data
public class EmployeeService {

    private Employee employee;

    // we will ask this to spring.
    public void createEmployee(){

    }

    public void displayEmployee(){
        System.out.println("employee details are "+employee);
    }
}
