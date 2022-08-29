package com.jan1ooo.parking.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class Parking {
    private String id;
    private String licence;
    private String state;
    private String model;
    private String color;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private Double bill;

    public Parking(String id, String licence, String state, String model, String color) {
        this.id = id;
        this.licence = licence;
        this.state = state;
        this.model = model;
        this.color = color;
    }

    public Parking() {
    }
}
