package us.temperature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.temperature.model.Temperature;
import us.temperature.repositories.TemperatureScoreDataAccess;

import java.time.Instant;
import java.util.Date;


@Service
public class TemperatureScoreSerivceImpl implements TemperatureScoreSerivce {

    @Autowired
    GeoHashService geoHashService;
    @Autowired
    TemperatureScoreDataAccess temperatureScoreDataAccess;

    @Override
    public Temperature getTemperature(Double latitude, Double longtitude) {

        String geoHashId = geoHashService.getGeoHashId(latitude, longtitude);

        //Todo: call cache access to see if geoHashId, timestamp has been hashed in cache

        return temperatureScoreDataAccess.getTemperature(geoHashId, Instant.now());
    }

}
