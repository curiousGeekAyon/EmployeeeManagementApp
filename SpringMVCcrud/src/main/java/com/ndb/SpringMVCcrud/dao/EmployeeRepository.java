package com.ndb.SpringMVCcrud.dao;

import com.ndb.SpringMVCcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //add a method to sort by firstname
    public List<Employee> findAllByOrderByFirstNameAsc();
}
