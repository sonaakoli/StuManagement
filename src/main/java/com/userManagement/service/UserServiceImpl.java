package com.userManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userManagement.contant.UserContant;
import com.userManagement.model.User;
import com.userManagement.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
	private UserRepo repo;
	
	@Override
	public boolean saveUser(User user) {
		user.setIsActive(UserContant.ISACTIVET);
		User newUser = repo.save(user);
		
		if(newUser !=null && newUser.getUserId()!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
