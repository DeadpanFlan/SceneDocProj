package com.scenedocproj.controller;

import com.scenedocproj.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.scenedocproj.service.UserServiceInterface;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceInterface userService;
	
	@RequestMapping("/users")
	public List<User> listUsers(){
		return userService.findAll();
	}
	
	@RequestMapping("/users/{id}")
	public User findUser(@PathVariable Long id) {
		return userService.findById(id);
	}
}