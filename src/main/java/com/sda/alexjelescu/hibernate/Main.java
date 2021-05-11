package com.sda.alexjelescu.hibernate;

import com.sda.alexjelescu.hibernate.model.Department;
import com.sda.alexjelescu.hibernate.repository.DepartmentRepository;
import com.sda.alexjelescu.hibernate.utils.SessionManager;

public class Main {
    public static void main(String[] args) {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        departmentRepository.save("HR");

        Department department = departmentRepository.findById(1);
        System.out.println(department);

        department.setName("HR_Department");
        departmentRepository.update(department);

        department = departmentRepository.findById(1);
        System.out.println(department);

        departmentRepository.delete(department);

        department = departmentRepository.findById(1);
        System.out.println(department);

        departmentRepository.save("IT");

        Department department2 = departmentRepository.findById(2);
        System.out.println(department2);

        SessionManager.shutDown();





    }
}
