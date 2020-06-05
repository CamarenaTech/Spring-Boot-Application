package com.kfc.demo.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfc.demo.entity.User;
import com.kfc.demo.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repo;
	
	@Override
	public Iterable<User> getAllUsers() {
		
		return  repo.findAll();
	}

}
