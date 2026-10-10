package com.example.hotel.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CancellationRequest {

    private String cancellationDate;

    public CancellationRequest() {}

    public CancellationRequest(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }
}