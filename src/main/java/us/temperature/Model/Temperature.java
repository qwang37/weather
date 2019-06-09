package us.temperature.Model;

import us.temperature.Model.Enum.Degree;

public class Temperature {
    private String geoHashId; //location (x, y) -> id
    private String time;
    private int value;
    private Degree degree;

    public String getGeoHashId() {
        return geoHashId;
    }

    public void setGeoHashId(String geoHashId) {
        this.geoHashId = geoHashId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
