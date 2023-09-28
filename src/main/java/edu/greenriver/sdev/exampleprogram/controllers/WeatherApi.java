package edu.greenriver.sdev.exampleprogram.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class declares any routes to HTTP resources.
 * This is a web-adress(URL) and an HTTP verb
 * (GET,POST,PUT,DELETE)
 *
 * @author  Adam Wise
 * @version 1.0
 *
 *
 */


@RestController
@RequestMapping("api/v1")
public class WeatherApi
{
    /**
     * Return some weather data (not a web page)
     *
     * @return a list of weather data points
     *
     * This endpoint is at http://localhost::8080/weather
     */
    @GetMapping(path = "weather")
    public List<WeatherReading> getReadings()
    {
        return List.of(
                new WeatherReading("Spokane","Sunny",70.0,"10/10/2021 8:00pm"),
                new WeatherReading("Tacoma","Rain",70.0,"12/2/1991 6:30am"),
                new WeatherReading("Kent","Cloudy",70.0,"6/5/1998 4:20pm"),
                new WeatherReading("Wilkeson","Snowy",70.0,"7/10/2021 6:43Pm"),
                new WeatherReading("Seattle","Rainy",42.0,"7/20/2021 6:10Pm")

        );
    }

    @GetMapping( path = "temps")
    public List<Double> getAllTemps()
    {
        return List.of(70.0,24.0,66.0,69.0);
    }
}
