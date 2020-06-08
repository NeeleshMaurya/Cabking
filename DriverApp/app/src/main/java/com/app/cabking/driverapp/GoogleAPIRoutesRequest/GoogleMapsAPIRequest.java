package com.app.cabking.driverapp.GoogleAPIRoutesRequest;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GoogleMapsAPIRequest {
    @SerializedName("routes")
    public ArrayList<Routes> routes;
}

