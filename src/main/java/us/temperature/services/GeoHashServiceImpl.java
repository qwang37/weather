package us.temperature.services;

import org.springframework.stereotype.Service;

@Service
public class GeoHashServiceImpl implements GeoHashService {
    @Override
    public String getGeoHashId(Double latitude, Double longtitude) {
        //Todo: should call a library to convert (lat, longt) -> hashcode
        return latitude.toString() + ":" + longtitude.toString();
    }
}
