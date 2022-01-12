package com.NailShop.booking.service;

import com.NailShop.booking.Repo.UserRepository;
import com.NailShop.booking.model.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void getUserById(Integer id){
        userRepository.findById(id);
    }

    public void createUsers(User user){

        String username = user.getUsername();
        if(username != null){
            throw new IllegalStateException("Username already exists try another username");
        }
        userRepository.save(user);
    }

    public void deleteUser(String username){
        User user = userRepository.findByUsername(username);
        userRepository.delete(user);
    }
}
