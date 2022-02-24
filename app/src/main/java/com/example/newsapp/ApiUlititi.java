package com.example.newsapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class  ApiUlititi {
    private static Retrofit retrofit = null;

    public static ApiInterface getApiInterface()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiInterface.Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }
}