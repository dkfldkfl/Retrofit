package com.example.a1.retrofittest;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SOService {


    @FormUrlEncoded
    @POST("get_sleep_day_recent")
    Call<ResultModel> getResult(@Field("qrcode") String qrcode, @Field("position") String position);


}
