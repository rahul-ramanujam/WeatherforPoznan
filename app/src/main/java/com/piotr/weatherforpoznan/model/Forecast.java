package com.piotr.weatherforpoznan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piotrek on 15-10-01.
 */
public class Forecast {
    @SerializedName("city")
    City city;

    @SerializedName("list")
    java.util.List<ForecastItem> list;

    public List<ForecastItem> getList() {
        return list;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "city=" + city +
                ", list=" + list +
                '}';
    }
}