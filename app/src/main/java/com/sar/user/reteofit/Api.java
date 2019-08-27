package com.sar.user.reteofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_url="https://api.myjson.com/bins/";

    @GET("1ecolb")
    Call<List<Model>> getmodel();

}
