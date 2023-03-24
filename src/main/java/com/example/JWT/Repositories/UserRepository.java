package com.example.JWT.Repositories;

import com.example.JWT.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}
