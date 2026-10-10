package com.example.hotel.model;

import com.example.hotel_booking.Model.CancellationPolicy;
import com.example.hotel_booking.Model.Room;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Booking{
        String bookingId,
        String hotelName,
        LocalDate checkIn,
        LocalDate checkOut,
        String currency,
        BigDecimal totalAmount,
        List<Room> rooms,
        List<CancellationPolicy> cancellationPolicies
}