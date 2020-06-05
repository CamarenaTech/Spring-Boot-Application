package com.kfc.demo.services;

import java.util.Iterator;

import com.kfc.demo.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

}
