package com.bhup6.jpqlquery.Repository;

import com.bhup6.jpqlquery.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    //JPQL Query

    @Query("select e from Employee e")
    public List<Employee> getAllEmployeeJPQL();

   // @Query("select e from Employee e where e.name =:n")
    //public List<Employee> getByNameJPQL(@Param("n")String Name);
                        //OR
    @Query("select e from Employee e where e.name =?1")
    public List<Employee> getByNameJPQL(String Name);

    @Query("select e from Employee e where e.fname = ?1")
    public List<Employee> getByfNameJPQL(String fname);
                        //OR
    // @Query("select e from Employee e where e.fname =:f")
  //  public List<Employee> getByfNameJPQL(@Param("f")String fname);

    @Query("select e from Employee e where e.city =:c")
    public List<Employee> getByCityJPQL(@Param("c")String city);

    @Query("select e from Employee e where e.state =:s")
    public List<Employee> getByStateJPQL(@Param("s")String state);

    @Query("select e from Employee e where e.name =:n or e.city =:c")
    public List<Employee> getByNameOrCityJPQL(@Param("n")String fname,@Param("c")String city);

    @Query("select e from Employee e where e.name =:n and e.fname =:f")
    public List<Employee> getByNameAndfNameJPQL(@Param("n")String name,@Param("f")String fname);

    //Native Query that means SQL Query
    @Query(value = "select * from employee", nativeQuery = true)
    public List<Employee> getAllEmployeeNative();

   // @Query(value = "select * from employee e where e.name = ?1", nativeQuery = true)
    //public List<Employee>getByNameNative(String name);
                        //OR
    @Query(value = "select * from employee e where e.name =:n", nativeQuery = true)
    public List<Employee>getByNameNative(@Param("n") String name);

}
