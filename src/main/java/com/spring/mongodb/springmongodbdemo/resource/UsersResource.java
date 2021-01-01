package com.spring.mongodb.springmongodbdemo.resource;
import com.spring.mongodb.springmongodbdemo.document.Users;
import com.spring.mongodb.springmongodbdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersResource {

//    ctrl alt L
//    alt enter
//    @Autowired is not required if constructor is defined spring boot does it itself

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public List<Users> getAll(){
        return userRepository.findAll();
    }


}
