package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

	List<User> findAll();

	User insertByUser(User user);

	User update(User user);

	User delete(Long id);

	User findById(Long id);
}
