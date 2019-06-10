package us.temperature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import us.temperature.model.Temperature;
import us.temperature.services.GeoHashService;
import us.temperature.services.TemperatureHistorySerivce;
import us.temperature.services.TemperatureScoreSerivce;

import java.util.Date;


@RestController
public class TemperatureController {


    @Autowired
    TemperatureScoreSerivce temperatureScoreSerivce;

    @Autowired
    TemperatureHistorySerivce temperatureHistoryService;

    @GetMapping("/temperature")
    public Temperature getTemperature(@RequestParam(name = "latitude") Double latitude,
                                      @RequestParam(name = "longitude") Double longitude){

        //Todo: add validator here to make sure param formats are expected

        return temperatureScoreSerivce.getTemperature(latitude, longitude);
    }

    @GetMapping("/temperature/history")
    public String getTemperatureHistory(@RequestParam(name = "latitude") Double latitude,
                                        @RequestParam(name = "longitude") Double longitude,
                                        @RequestParam(name = "timespan") String timespan){
        //Todo: add validator here to make sure param formats are expected

        return temperatureHistoryService.getTemperatureHistory(latitude, longitude, timespan);
    }


}
