package com.auth.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auth.boot.domain.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    
    Role findByRole(String role);
}
