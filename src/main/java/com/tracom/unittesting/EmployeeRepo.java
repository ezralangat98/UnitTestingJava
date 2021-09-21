package com.tracom.unittesting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    @Query("SELECT emp FROM Employee emp WHERE emp.emp_email = ?1")
    Employee findByEmail(Employee emp_email);
}
