package com.alexkas.spring.rest;

import com.alexkas.spring.rest.configuration.MyConfig;
import com.alexkas.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);


//        List<Employee> allEmployee = communication.getAllEmployee();
//        System.out.println(allEmployee);

//        Employee employeeById = communication.getEmployee(4);
//        System.out.println(employeeById);

//        Employee employee = new Employee("Artur", "Barabanov", "IT", 900,"jobTitle"
//                , "12.06.1999");
//        communication.saveEmployee(employee);

//        communication.deleteEmployee(1);
    }
}
