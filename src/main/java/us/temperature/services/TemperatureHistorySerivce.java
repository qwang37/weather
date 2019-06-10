package us.temperature.services;

public interface TemperatureHistorySerivce {
    String getTemperatureHistory(Double latitude, Double longitude, String timespan);

}
