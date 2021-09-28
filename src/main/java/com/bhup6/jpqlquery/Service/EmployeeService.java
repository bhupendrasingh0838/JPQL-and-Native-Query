package com.bhup6.jpqlquery.Service;

import com.bhup6.jpqlquery.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee getEmployee(int emp_id);

    public void createEmployee(Employee employee);

    public void deleteEmployee(int emp_id);

    public Employee updateEmployee(int emp_id,Employee employee);

    //JPQL Query

    public List<Employee> getAllEmployeeJPQL();

    public List<Employee> getByNameJPQL(String name);

    public List<Employee> getByfNameJPQL(String fname);

    public List<Employee>getByCityJPQL(String city);

    public List<Employee>getByStateJPQL(String state);

    public List<Employee>getByNameOrCityJPQL(String name,String city);

    public List<Employee>getByNameAndfNameJPQL(String name,String fname);

    //Native Query

    public List<Employee> getAllEmployeeNative();

    public List<Employee>getByNameNative(String name);


}
