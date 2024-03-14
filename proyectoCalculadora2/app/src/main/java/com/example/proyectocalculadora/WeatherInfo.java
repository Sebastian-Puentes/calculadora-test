package com.example.proyectocalculadora;
import com.google.gson.annotations.SerializedName;
public class WeatherInfo {
    @SerializedName("description")
    private String description;

    public String getDescription() {
        return description;
    }
}
