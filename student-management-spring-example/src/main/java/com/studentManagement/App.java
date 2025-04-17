package com.studentManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.studentManagement.service.StudentService;

public class App 
{
    public static void main( String[] args )
    {

//        StudentService studentService = new StudentService();
//
//        Student student =Student.builder()
//                .stdId(1)
//                .name("abc")
//                .gender("male")
//                .city("pune")
//                .contactNo(Long.parseLong("9898745874"))
//                .build();
//
//         studentService.setStudent(student);
//
//         studentService.displayStudent();


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        StudentService studentService = context.getBean("studentService",StudentService.class);

        studentService.displayStudent();
    }
}
