package com.example.hotel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@JsonIgnoreProperties(ignoreUnknown = true)
public record CancellationPolicy(
        LocalDateTime from,
        LocalDateTime to,
        BigDecimal penalty
) {}