package com.example.valoapi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL = "https://valorant-api.com/v1/";

    @GET("agents")
    Call<AgentPojo> getAgents(@Query("isPlayableCharacter") Boolean flag);

    @GET("agents")
    Call<AgentPojo> getabilitys();

}
