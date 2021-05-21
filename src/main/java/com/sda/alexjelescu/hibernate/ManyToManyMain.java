package com.sda.alexjelescu.hibernate;

import com.sda.alexjelescu.hibernate.model.Account;
import com.sda.alexjelescu.hibernate.model.Employee;
import com.sda.alexjelescu.hibernate.model.Project;
import com.sda.alexjelescu.hibernate.repository.EmployeeRepository;
import com.sda.alexjelescu.hibernate.repository.ProjectRepository;
import com.sda.alexjelescu.hibernate.utils.SessionManager;

import java.sql.Date;

public class ManyToManyMain {
    public static void main(String[] args) {
        ProjectRepository projectRepository = new ProjectRepository();

        Project project1 = new Project();
        project1.setName("ProjectX");
        projectRepository.save(project1);

        Project project2 = new Project();
        project2.setName("ProjectY");
        projectRepository.save(project2);

        EmployeeRepository employeeRepository = new EmployeeRepository();

        Employee employee1 = new Employee();
        employee1.setFirstName("Mircea");
        employee1.setLastName("Popa");
        employee1.setEmail("jgfuf@yahoo.com");
        employee1.setDateOfBirth(Date.valueOf("1987-02-03"));
        employee1.setPhoneNumber("0744128986");
        employee1.setSalary(5000);
        Account account1 = new Account();
        account1.setCreationDate(Date.valueOf("1995-09-23"));
        employee1.getProjects().add(project1);
        employee1.getProjects().add(project2);
        employeeRepository.save(employee1, account1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Vasile");
        employee2.setLastName("Vasilescu");
        employee2.setEmail("jgfuf@yahoo.com");
        employee2.setDateOfBirth(Date.valueOf("1950-02-03"));
        employee2.setPhoneNumber("0744654548");
        employee2.setSalary(12000);
        Account account2 = new Account();
        account2.setCreationDate(Date.valueOf("2000-10-29"));
        employee2.getProjects().add(project1);
        employeeRepository.save(employee2, account2);

        Employee employee3 = new Employee();
        employee3.setFirstName("Mihai");
        employee3.setLastName("Lumanare");
        employee3.setEmail("sfgfdsdsg@gmail.com");
        employee3.setDateOfBirth(Date.valueOf("1985-02-08"));
        employee3.setPhoneNumber("0730954432");
        employee3.setSalary(12000);
        Account account3 = new Account();
        account3.setCreationDate(Date.valueOf("1995-08-05"));
        employee3.getProjects().add(project1);
        employee3.getProjects().add(project2);
        employeeRepository.save(employee3, account3);



        SessionManager.shutDown();
    }
}
