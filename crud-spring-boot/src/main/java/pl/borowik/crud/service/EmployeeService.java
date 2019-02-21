package pl.borowik.crud.service;

import pl.borowik.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int theId);
    void save(Employee theEmployee);
    void deleteById(int theId);
}
