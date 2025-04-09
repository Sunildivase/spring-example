package com.employeeManagement.model;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@Data
public class Employee {
    private int empId;
    private String empName;
    private int age;
    private String gender;
    private long contactNo;
}
