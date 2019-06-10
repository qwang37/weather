package us.temperature.services;

import us.temperature.model.Temperature;

import java.util.Date;

public interface TemperatureScoreSerivce {
    Temperature getTemperature(Double latitude, Double longtitude);
}
