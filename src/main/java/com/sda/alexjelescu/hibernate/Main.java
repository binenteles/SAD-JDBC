package com.sda.alexjelescu.hibernate;

import com.sda.alexjelescu.hibernate.model.*;
import com.sda.alexjelescu.hibernate.repository.DepartmentRepository;
import com.sda.alexjelescu.hibernate.repository.EmployeeRepository;
import com.sda.alexjelescu.hibernate.repository.ProjectRepository;
import com.sda.alexjelescu.hibernate.utils.SessionManager;

import java.lang.reflect.AccessibleObject;
import java.sql.Date;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {


        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department1 = new Department();
        department1.setName("HR");
        departmentRepository.save(department1);

        Department department = departmentRepository.findById(1);
        System.out.println(department);

        department.setName("HR_Department");
        departmentRepository.update(department);

         department = departmentRepository.findById(1);
        System.out.println(department);

        departmentRepository.delete(department);

        department = departmentRepository.findById(1);
        System.out.println(department);

        Department department2 = new Department();


       Department de = departmentRepository.findById(2);
       System.out.println(department2);
        departmentRepository.save(department2);
//        SessionManager.shutDown();

        ProjectRepository projectRepository = new ProjectRepository();
        Project project = new Project();
        project.setName("Star Monkey Project");
        project.setBudget(1230);
        project.setCurrency("EUR");
        project.setProjectType(ProjectType.ENTERPRISE);

        projectRepository.save(project);

        Department department3 = new Department();
        department3.setName("Marketing");

        departmentRepository.save(department3);


        Employee employee1 = new Employee();
        employee1.setFirstName("Mircea");
        employee1.setLastName("Popa");
        employee1.setEmail("jgfuf@yahoo.com");
        employee1.setDateOfBirth(Date.valueOf("1987-02-03"));
        employee1.setPhoneNumber("0744128986");
        employee1.setSalary(5000);
        employee1.setDepartment(department3);

        Employee employee2 = new Employee();
        employee2.setFirstName("Vasile");
        employee2.setLastName("Vasilescu");
        employee2.setEmail("jgfuf@yahoo.com");
        employee2.setDateOfBirth(Date.valueOf("1950-02-03"));

        employee2.setPhoneNumber("0744654548");
        employee2.setSalary(12000);
        employee2.setDepartment(department3);


        Account account1 = new Account();
        account1.setCreationDate(Date.valueOf("1195-09-20"));
        Account account2 = new Account();
        account2.setCreationDate(Date.valueOf("1998-05-14"));

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(employee1, account1);
        employeeRepository.save(employee2, account2);


        System.out.println(employeeRepository.findById(1));
        System.out.println(employeeRepository.findById(2));




    }
}
