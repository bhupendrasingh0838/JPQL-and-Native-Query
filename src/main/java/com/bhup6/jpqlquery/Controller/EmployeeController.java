package com.bhup6.jpqlquery.Controller;

import com.bhup6.jpqlquery.Entity.Employee;
import com.bhup6.jpqlquery.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee(){
        return (List<Employee>) service.getAllEmployee();
    }
    @GetMapping("/getEmployee/{emp_id}")
    public Employee getEmployee(@PathVariable int emp_id) {
        Employee employee = service.getEmployee(emp_id);
        return employee;
    }
    @PostMapping("/createEmployee")
    public String createEmployee(@RequestBody Employee employee){
        service.createEmployee(employee);
        return "Data Created Successfully";
    }
    @DeleteMapping("/deleteEmployee/{emp_id}")
    public String deleteEmployee(@PathVariable int emp_id){
        service.deleteEmployee(emp_id);
        return "Data Deleted Successfully";
    }
    @PutMapping("/updateEmployee/{emp_id}")
    public Employee updateEmployee(@PathVariable int emp_id,@RequestBody Employee employee){
        service.updateEmployee(emp_id, employee);
        return employee;
    }
    //JPQL Query
    @GetMapping("/getAllEmployeeJPQL")
    public List<Employee> getAllEmployeeJPQL(){
        return service.getAllEmployeeJPQL();
    }
    @GetMapping("/getByNameJPQL/{name}")
    public List<Employee> getByNameJPQL(@PathVariable String name){
        return service.getByNameJPQL(name);
    }
    @GetMapping("/getByfNameJPQL/{fname}")
    public List<Employee> getByfNameJPQL(@PathVariable String fname) {
        return service.getByfNameJPQL(fname);
    }

    @GetMapping("/getByCityJPQL/{city}")
    public List<Employee> getByCityJPQL(@PathVariable String city) {
        return service.getByCityJPQL(city);
    }

    @GetMapping("/getByStateJPQL/{state}")
    public List<Employee> getByStateJPQL(@PathVariable String state) {
        return service.getByStateJPQL(state);
    }

    @GetMapping("/getByNameOrCityJPQL/{name}/{city}")
    public List<Employee> getByNameOrCityJPQL(@PathVariable String name,@PathVariable String city) {
        return service.getByNameOrCityJPQL(name,city);
    }

    @GetMapping("/getByNameAndfNameJPQL/{name}/{fname}")
    public List<Employee> getByNameAndfNameJPQL(@PathVariable String name,@PathVariable String fname) {
        return service.getByNameAndfNameJPQL(name, fname);
    }

    //Native Query
    @GetMapping("/getAllEmployeeNative")
    public List<Employee> getAllEmployeeNative(){
        return service.getAllEmployeeNative();
    }

    @GetMapping("/getByNameNative/{name}")
    public List<Employee>getByNameNative(@PathVariable String name){return service.getByNameNative(name);}


}
