package com.NailShop.booking.model;

import com.NailShop.booking.Repo.BookingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookingTest {

    @Autowired
    private BookingRepository bookingRepository;

    @Test
    public void creatingBooking(){

        Booking booking = Booking.builder()
                .name("Alex")
                .lastName("Sanchez")
                .email("AlexS@gmail.com")
                .phoneNumber(123123123)
                .appointDate(LocalDate.of(2022,1,20))
                .bookingTime(LocalTime.now())
                .build();

        bookingRepository.save(booking);
    }

}