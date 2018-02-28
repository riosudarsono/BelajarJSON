package com.riosudarsono.belajarjson.network;

import com.riosudarsono.belajarjson.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by user on 19/02/2018.
 */

public interface ApiServices {
    @GET("tampil_berita.php")
    Call<ResponseBerita> request_show_all_berita();
}
