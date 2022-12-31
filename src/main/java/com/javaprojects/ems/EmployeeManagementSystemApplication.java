package com.javaprojects.ems;

import com.javaprojects.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
		
//		Employee employee1 = new Employee("John", "Johnson", "john@email.com");
//		employeeRepository.save(employee1);
//		
//		Employee employee2 = new Employee("Bill", "Williams", "bill@email.com");
//		employeeRepository.save(employee2);
//		
//		Employee employee3 = new Employee("George", "Osborne", "george@email.com");
//		employeeRepository.save(employee3);

    }

}
