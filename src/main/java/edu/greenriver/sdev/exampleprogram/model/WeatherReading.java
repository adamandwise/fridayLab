package edu.greenriver.sdev.exampleprogram.model;

import lombok.*;

@Data
@AllArgsConstructor
public class WeatherReading {

    private String location;
    private String condition;
    private double tempF;
    private String dateTime;


}
