package com.tracom.unittesting;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceClass {

    private UserRepo uRepo;
    //Create
    public void saveUser(User user){
        uRepo.save(user);
    }
    //Retrieve
    public List<User> listUser(){
        return uRepo.findAll();
    }
    //Delete
    public void deleteUser(int user_id){
        uRepo.deleteById(user_id);
    }
    //Update
    public User updateUser(int user_id){
        return uRepo.findById(user_id).get();
    }
}
