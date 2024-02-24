package com.userManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userManagement.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
