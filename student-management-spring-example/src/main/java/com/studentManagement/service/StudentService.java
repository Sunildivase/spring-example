package com.studentManagement.service;

import lombok.*;
import com.studentManagement.model.Student;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@Builder
public class StudentService {

    private Student student;

    public void createStudent(){

    }

    public void displayStudent(){
        System.out.println("student list "+student);
    }
}
