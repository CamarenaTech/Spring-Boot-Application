package com.kfc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kfc.demo.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long>{
	
	
}
