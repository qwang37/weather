package us.temperature.model;

import us.temperature.model.Enum.DegreeType;

import java.time.Instant;

public class Temperature {
    private Double latitude;
    private Double longtitude;
    private Instant utcTime;
    private Double score;
    private DegreeType degreeType;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

    public Instant getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(Instant utcTime) {
        this.utcTime = utcTime;
    }
}
