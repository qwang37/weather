package us.temperature.repositories;

import us.temperature.model.Temperature;

import java.time.Instant;

public interface TemperatureScoreDataAccess {
    Temperature getTemperature(String geoHashId, Instant timestamp);
}
