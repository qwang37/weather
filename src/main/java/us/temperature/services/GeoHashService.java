package us.temperature.services;

public interface GeoHashService {
    String getGeoHashId(Double latitude, Double longtitude);
}
