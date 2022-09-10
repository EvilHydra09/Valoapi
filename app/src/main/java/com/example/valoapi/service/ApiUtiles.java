package com.example.valoapi.service;

import com.example.valoapi.service.ApiInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtiles {

    public static Retrofit retrofit = null;

    public static ApiInterface getapApiInterface(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiInterface.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
