package com.sendy.googlemaps.model;

import com.google.gson.annotations.SerializedName;
import com.sendy.googlemaps.model.util_pojo.Route;

import java.util.ArrayList;
import java.util.List;

public class DirectionResults {
    @SerializedName("routes")
    public List<Route> routes = new ArrayList<>();

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

}






