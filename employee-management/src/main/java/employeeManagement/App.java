package employeeManagement;

import employeeManagement.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main( String[] args )
    {
//        EmployeeService employeeService = new EmployeeService();

//        Employee employee = Employee.builder()
//        .empId(1)
//        .empName("john")
//        .age(26)
//        .gender("male")
//        .contactNo(985641254).build();
//
//        employeeService.setEmployee(employee);
//
//        employeeService.displayEmployee();



        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        employeeService.displayEmployee();
    }
}
