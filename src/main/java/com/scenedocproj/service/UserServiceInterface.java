package com.scenedocproj.service;

import com.scenedocproj.model.User;
import java.util.List;

public interface UserServiceInterface {

	public List<User> findAll();
	
	public User findById(Long id);
	
}