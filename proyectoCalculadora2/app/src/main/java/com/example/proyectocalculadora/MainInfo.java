package com.example.proyectocalculadora;
import com.google.gson.annotations.SerializedName;
public class MainInfo {
    @SerializedName("temp")
    private double temperature;

    public double getTemperature() {
        return temperature;
    }
}
