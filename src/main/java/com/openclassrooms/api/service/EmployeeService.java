package com.openclassrooms.api.service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.api.model.Employee;
import com.openclassrooms.api.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id){ // recherche un employé par un id
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees(){ // recherche tous les employés
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id){ // suppression d'un employé par un id
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee){ //Insertion d'un employé
        Employee saveEmployee = employeeRepository.save(employee);
        return saveEmployee;
    }

}
