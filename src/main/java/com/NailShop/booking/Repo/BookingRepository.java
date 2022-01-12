package com.NailShop.booking.Repo;

import com.NailShop.booking.model.Booking;
import com.NailShop.booking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookingRepository
        extends JpaRepository<Booking, Long> {
}
