package com.NailShop.booking.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@Table
@Data
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    @SequenceGenerator(
            name = "booking_sequence",
            sequenceName = "booking_sequence"

    )
    @GeneratedValue(
            generator = "booking_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long bookingId;

    private String name;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private LocalDate appointDate;
    private LocalTime bookingTime;



}
