package com.game.drugman.Controller;

import com.game.drugman.exception.ResourceNotFoundException;
import com.game.drugman.model.User;
import com.game.drugman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("user")
    public List<User> listarUsuarios() throws ResourceNotFoundException {
        return userRepository.findAll();
    }

    @PostMapping("crear")
    public User guardarUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PostMapping("prueba")
    public void prueba(@RequestBody String str){
        System.out.println(str);
    }
    
}
