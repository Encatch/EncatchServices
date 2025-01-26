package com.encatch.encatchservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encatch.encatchservices.model.User;
import com.encatch.encatchservices.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }

	public User getUserById(Long id) {
		 return repository.getById(id);
	}

	public User updateUser(Long id, User user) {
		 return repository.save(user);
	}
}