package com.tracom.unittesting;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String user_name;
    private String user_email;
    @OneToOne
    private Employee emp_id;


//    public User() {
//    }
//
//    public User(String user_name, String user_email) {
//        this.user_name = user_name;
//        this.user_email = user_email;
//    }
//
//    public User(int user_id, String user_name, String user_email) {
//        this.user_id = user_id;
//        this.user_name = user_name;
//        this.user_email = user_email;
//    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public Employee getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Employee emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", emp_id=" + emp_id +
                '}';
    }
}
