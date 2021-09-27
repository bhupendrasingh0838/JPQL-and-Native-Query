package com.bhup6.jpqlquery.Service;

import com.bhup6.jpqlquery.Entity.Employee;
import com.bhup6.jpqlquery.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repository.findAll();
    }
    @Override
    public Employee getEmployee(int emp_id){
        return repository.findById(emp_id).get();
    }

    @Override
    public void createEmployee(Employee employee) {
        repository.save(employee);

    }

    @Override
    public void deleteEmployee(int emp_id) {
        repository.deleteById(emp_id);

    }

    @Override
    public Employee updateEmployee(int emp_id, Employee employee) {
        Employee employee1=repository.findById(emp_id).get();
        employee1.setName(employee.getName());
        employee1.setFname(employee.getFname());
        employee1.setCity(employee.getCity());
        employee1.setState(employee.getState());
        repository.save(employee1);
        return employee1;
    }

    //JPQL Query

    @Override
    public List<Employee> getAllEmployeeJPQL() {
        return repository.getAllEmployeeJPQL();
    }

    @Override
    public List<Employee> getByNameJPQL(String name) {
        return repository.getByNameJPQL(name);
    }

    @Override
    public List<Employee> getByfNameJPQL(String fname) {
        return repository.getByfNameJPQL(fname);
    }

    @Override
    public List<Employee> getByCityJPQL(String city) {
        return repository.getByCityJPQL(city);
    }

    @Override
    public List<Employee> getByStateJPQL(String state) {
        return repository.getByStateJPQL(state);
    }

    @Override
    public List<Employee> getByNameOrCityJPQL(String name, String city) {
        return repository.getByNameOrCityJPQL(name,city);
    }

    @Override
    public List<Employee> getByNameAndfNameJPQL(String name, String fname) {
        return repository.getByNameAndfNameJPQL(name, fname);
    }

    @Override
    public List<Employee> getAllEmployeeNative() {
        return repository.getAllEmployeeNative();
    }


}
