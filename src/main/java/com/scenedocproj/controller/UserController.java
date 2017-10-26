package com.scenedocproj.controller;

import com.scenedocproj.model.User;
import com.scenedocproj.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> listUsers(){
		return userRepo.findAll();
	}

	@RequestMapping(value="/users", consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@RequestBody User req){
		userRepo.save(req);
	}

	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public User getUser(@PathVariable Long id) {
		return userRepo.findOne(id);
	}
	
	@RequestMapping(value="/users/{id}", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void updateUser(@PathVariable Long id, @RequestBody User req ) {
		User user = userRepo.findOne(id);
		if(req.getFirstname() != user.getFirstname()) {
			user.setFirstname(req.getFirstname());
		}
		if(req.getMiddlename() != user.getMiddlename()) {
			user.setMiddlename(req.getMiddlename());
		}
		if(req.getLastname() != user.getLastname()) {
			user.setLastname(req.getLastname());
		}
		if(req.getUsername() != user.getUsername()) {
			user.setUsername(req.getUsername());
		}
		if(req.getGender() != user.getGender()) {
			user.setGender(req.getGender());
		}
		if(req.isActive() != user.isActive()) {
			user.setActive(req.isActive());
		}
		if(req.isAdmin() != user.isAdmin()) {
			user.setAdmin(req.isAdmin());
		}
		userRepo.save(user);
	}

	@RequestMapping(value="/users/{id}", method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		User user = userRepo.findOne(id);
		userRepo.delete(user);
	}
	


}