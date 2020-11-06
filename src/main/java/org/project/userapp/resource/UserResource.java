package org.project.userapp.resource;

import java.util.List;
import java.util.Optional;

import org.project.userapp.model.User;
import org.project.userapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping
	public List<User> allUsers(){
		System.out.println("List all");
		return this.userRepo.findAll();
	}
	
	@PostMapping
	public void addUser(@RequestBody User user) {
		this.userRepo.insert(user);
		return;
	}
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		this.userRepo.save(user);
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable("id") String id) {
		return this.userRepo.findById(id);
	}
}
