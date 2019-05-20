package com.sendy.googlemaps.network;

import com.sendy.googlemaps.model.DirectionResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MyApiInterface {

//    @GET("api/directions/json?key=AIzaSyBTpq2aXpU-MsCALXcmCWpNE6-hNZ11mZI")
//    Call<DirectionResults> getJson(@Query("origin") String origin, @Query("destination") String destination);
//

    @GET("json?")
    Call<DirectionResults> getJson(

            @Query("origin")String origin,
            @Query("destination")String destination,
            @Query("key")String key


    );

}