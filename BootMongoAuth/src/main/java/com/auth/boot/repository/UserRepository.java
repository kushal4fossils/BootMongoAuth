package com.auth.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auth.boot.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
    
    User findByEmail(String email);
    
}
