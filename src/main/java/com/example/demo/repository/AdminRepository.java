package com.example.demo.repository;

import com.example.demo.model.Admin;
import com.example.demo.crudRepository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<Admin> getALL(){
        return(List<Admin>) adminCrudRepository.findAll();
    }
    public Admin save(Admin admin){
        return adminCrudRepository.save(admin);
    }
    public Optional<Admin> getAdmin(int id){
        return adminCrudRepository.findById(id);
    }

    public void delete(Admin admin) {
        adminCrudRepository.delete(admin);
    }
}




