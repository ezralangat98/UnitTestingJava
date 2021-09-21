package com.tracom.unittesting;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.assertj.core.api.Assertions;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback
class UserRepoTest {

    @Autowired
    private UserRepo repo;
    @Autowired
    private TestEntityManager e;

    @Test
    public void createUserTest() {
        User us = new User();
        us.setUser_id(54345);
        us.setUser_name("nerd");
        us.setUser_email("bvgsfv@vcxvd.com");
        us.setEmp_id(us.getEmp_id());

        User saveus = repo.save(us);
        User exists = e.find(User.class, saveus.getUser_id());
        Assertions.assertThat(exists.getUser_id()).isEqualTo(us.getUser_id());
    }
    @Test
    public void findUserByName(){
        String name = "nerd";
        User us = repo.findByName(name);
        Assertions.assertThat(us).isNotNull();

    }

}