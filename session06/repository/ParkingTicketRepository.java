package com.example.session06.repository;

import com.example.session06.entity.ParkingTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ParkingTicketRepository
        extends JpaRepository<ParkingTicket, Long> {

    Optional<ParkingTicket>
    findFirstByVehicle_IdAndCheckOutTimeIsNullOrderByCheckInTimeDesc(
            Long vehicleId);
}