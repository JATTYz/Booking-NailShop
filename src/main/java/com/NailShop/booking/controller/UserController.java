package com.NailShop.booking.controller;

import com.NailShop.booking.Repo.UserRepository;
import com.NailShop.booking.model.User;
import com.NailShop.booking.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("{id}")
    public void getUserById(@PathVariable("id") Integer id){
        userService.getUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.createUsers(user);
    }

    @DeleteMapping
    public void deleteUser(String username){
        userService.deleteUser(username);
    }
}
