package us.temperature.repositories;

import org.springframework.stereotype.Service;
import us.temperature.model.Enum.DegreeType;
import us.temperature.model.Temperature;
import java.time.Instant;

@Service
public class TemperatureScoreDataAccessImpl implements TemperatureScoreDataAccess {

//    @Autowired
//    private final JdbcTemplate jdbcTemplate;

//    public TemperatureScoreDataAccessImpl(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public Temperature getTemperature(String geoHashId, Instant timestamp) {
        //Decode geohashId in library
        String[] parts = geoHashId.split("\\:");
        Double latitude = Double.parseDouble(parts[0]);
        Double longitude = Double.parseDouble(parts[1]);


        return loadFromDb(latitude, longitude, timestamp);
    }

    private Temperature loadFromDb(Double latitude, Double longitude, Instant timestamp){

        //String sql = "SELECT * FROM TEMPERATURE WHERE GEOID = ? AND TIMESTAMP = ?";
        //Temperature temperature = (Temperature)jdbcTemplate.queryForObject(sql, new Object[]{geoId, timestamp}, new BeanPropertyRowMapper(Temperature.class));

        Temperature temperatureFromDb = new Temperature();
        temperatureFromDb.setDegreeType(DegreeType.FAHRENHEIT);
        temperatureFromDb.setScore(70.0);
        temperatureFromDb.setLatitude(latitude);
        temperatureFromDb.setLongtitude(longitude);
        temperatureFromDb.setUtcTime(timestamp);
        return temperatureFromDb;

    }
}
