package edu.greenriver.sdev.exampleprogram.controllers;

public class WeatherReading {

    private String location;
    private String condition;
    private double tempF;
    private String dateTime;

    public WeatherReading(String location, String condition, double tempF, String dateTime) {
        this.location = location;
        this.condition = condition;
        this.tempF = tempF;
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "WeatherReading{" +
                "location='" + location + '\'' +
                ", condition='" + condition + '\'' +
                ", tempF=" + tempF +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
