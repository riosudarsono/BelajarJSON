package com.riosudarsono.belajarjson.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by user on 19/02/2018.
 */

public class InitRetrofit {
    public static String API_URL = "http://192.168.42.200/portal_berita/";

    public static Retrofit setInit(){
        return new Retrofit.Builder().baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getInstance(){
        return setInit().create(ApiServices.class);
    }
}
