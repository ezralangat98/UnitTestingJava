package com.tracom.unittesting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback
class EmployeeRepoTest {
    @Autowired
    private EmployeeRepo repo;
    @Autowired
    private TestEntityManager m;


    @Test
    public void create(){
        Employee e = new Employee();
        e.setEmp_email("mesh@gmail.com");
        e.setEmp_id(1);
        e.setEmp_name("Mesh");


        Employee saved = repo.save(e);
        Employee manage = m.find(Employee.class, saved.getEmp_id());
        Assertions.assertThat(manage.getEmp_id()).isEqualTo(e.getEmp_id());
    }
}