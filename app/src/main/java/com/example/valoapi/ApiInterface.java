package com.example.valoapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    String BASE_URL = "https://valorant-api.com/v1/";

    @GET("agents")
    Call<AgentPojo> getAgents();

}
