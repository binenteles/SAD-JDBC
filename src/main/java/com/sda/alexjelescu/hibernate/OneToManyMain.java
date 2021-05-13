package com.sda.alexjelescu.hibernate;

import com.sda.alexjelescu.hibernate.model.Account;
import com.sda.alexjelescu.hibernate.model.Employee;
import com.sda.alexjelescu.hibernate.model.Project;
import com.sda.alexjelescu.hibernate.model.ProjectType;
import com.sda.alexjelescu.hibernate.repository.EmployeeRepository;
import com.sda.alexjelescu.hibernate.repository.ProjectRepository;
import com.sda.alexjelescu.hibernate.utils.SessionManager;

import java.sql.Date;

public class OneToManyMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setFirstName("Mircea");
        employee1.setLastName("Popa");
        employee1.setEmail("jgfuf@yahoo.com");
        employee1.setDateOfBirth(Date.valueOf("1987-02-03"));
        employee1.setPhoneNumber("0744128986");
        employee1.setSalary(5000);
        Employee employee2 = new Employee();
        employee2.setFirstName("Vasile");
        employee2.setLastName("Vasilescu");
        employee2.setEmail("jgfuf@yahoo.com");
        employee2.setDateOfBirth(Date.valueOf("1950-02-03"));

        employee2.setPhoneNumber("0744654548");
        employee2.setSalary(12000);

        //ONE TO ONE
        Account account1 = new Account();
        account1.setCreationDate(Date.valueOf("1995-09-23"));
        Account account2 = new Account();
        account2.setCreationDate(Date.valueOf("2000-10-29"));

        ProjectRepository projectRepository = new ProjectRepository();
        Project project = new Project();

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(employee1, account1);
        employeeRepository.save(employee2, account2);

        System.out.println(employeeRepository.findById(1));
        System.out.println(employeeRepository.findById(2));


        project.setName("Star Monkey Project");
        project.setBudget(123);
        project.setCurrency("EUR");
        project.setProjectType(ProjectType.ENTERPRISE);

        projectRepository.save(project);

        SessionManager.shutDown();
    }
}
