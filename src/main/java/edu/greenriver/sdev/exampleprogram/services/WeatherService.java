package edu.greenriver.sdev.exampleprogram.services;

import edu.greenriver.sdev.exampleprogram.model.WeatherReading;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class WeatherService
{
  public List<WeatherReading> getAlLReadings()
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
