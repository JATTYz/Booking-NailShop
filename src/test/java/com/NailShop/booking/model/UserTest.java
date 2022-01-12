package com.NailShop.booking.model;

import com.NailShop.booking.Repo.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void createNewUser(){
        User user = User.builder()
                .username("User")
                .password("$2a$12$Pq/iwR9HepwsYOdpbqxT..UyZEX7kDa37U4/tcE39H81KK4Ys.gSW")
                .role("ADMIN")
                .build();

        userRepository.save(user);
    }

}