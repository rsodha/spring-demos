package com.rsodha.springjpamysql;

import org.springframework.data.repository.CrudRepository;

import com.rsodha.springjpamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}