package com.studentManagement.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private int stdId;
    private String name;
    private String gender;
    private String city;
    private long contactNo;
}
