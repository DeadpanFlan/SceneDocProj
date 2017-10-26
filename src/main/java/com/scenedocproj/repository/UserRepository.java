package com.scenedocproj.repository;

import com.scenedocproj.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAll();
	User findOne(Long id);
	User save(User user);
	void delete(User user);

}
