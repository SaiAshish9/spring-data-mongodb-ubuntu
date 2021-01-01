package com.spring.mongodb.springmongodbdemo.repository;

import com.spring.mongodb.springmongodbdemo.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <Users,Integer>{





}
