package com.example.valoapi.service;


import com.example.valoapi.agent.model.AgentPojo;
import com.example.valoapi.gun.GunPojo;
import com.example.valoapi.map.MapPojo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL = "https://valorant-api.com/v1/";

    @GET("agents")
    Call<AgentPojo> getAgents(@Query("isPlayableCharacter") Boolean flag);

    @GET("weapons")
    Call<GunPojo> getGuns();

    @GET("maps")
    Call<MapPojo> getMaps();

}
