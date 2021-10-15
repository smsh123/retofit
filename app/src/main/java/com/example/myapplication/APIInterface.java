package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

interface APIInterface {

//    @GET("/api/unknown")
//    Call<MultipleResource> doGetListResources();
//
//    @POST("/api/users")
//    Call<User> createUser(@Body User user);

//    @GET("/api.php?settings")
//    Call<Setting> doGetSetting(@Query("page") String page);

    @GET("/api.php?settings")
    Call<Setting> doGetSetting();
}
