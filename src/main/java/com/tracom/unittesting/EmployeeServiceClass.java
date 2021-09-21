package com.tracom.unittesting;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceClass {

    private EmployeeRepo uRepo;
    //Create
    public void saveEmp(Employee emp){
        uRepo.save(emp);
    }
    //Retrieve
    public List<Employee> listEmp(){
        return uRepo.findAll();
    }
    //Delete
    public void deleteEmp(int emp_id){
        uRepo.deleteById(emp_id);
    }
    //Update
    public Employee updateUser(int emp_id){
        return uRepo.findById(emp_id).get();
    }
}

