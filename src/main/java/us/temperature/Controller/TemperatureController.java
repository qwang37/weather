package us.temperature.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TemperatureController {

    @GetMapping("/temperature/score")
    public String getTemperatureScore(@RequestParam(name = "geoId") String geoId,
                                        @RequestParam(name = "timestamp") String timestamp){

        return "70";
    }

    @GetMapping("/temperature/history")
    public String getTemperatureHistory(@RequestParam(name = "geoId") String geoId,
                                        @RequestParam(name = "span") String span){

        return "70";
    }


}
