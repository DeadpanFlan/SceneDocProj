package com.scenedocproj.service;

import com.scenedocproj.model.User;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;



@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	private JdbcTemplate db;

	@Override
	public List<User> findAll() {
		
		String query = "SELECT * FROM USERS";
		List<User> users = db.query(query, new BeanPropertyRowMapper<User>(User.class));
		return users;
	}

	@Override
	public User findById(Long id) {
		String query = "SELECT * FROM USERS WHERE ID=?";
		User u = (User) db.queryForObject(query, new Object[]{id}, new BeanPropertyRowMapper<User>(User.class));
		return u;
	}
	
	
}