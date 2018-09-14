package com.example.a1.retrofittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private SOService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        service = ApiUtils.getSOService();

        service.getResult("820103030012170411A4C9B1", "l").enqueue(new Callback<ResultModel>() {
            @Override
            public void onResponse(Call<ResultModel> call, Response<ResultModel> response) {
//                Log.d("ㅇㅇ", "onResponse: " + call.toString() + "\n " +
//                        "\nheader " + response.headers() +
//                        "\ncode " + +response.code()
//                        + "\nbody getList" + response.body().getList().toString()
//                );


                if (response.headers().get("App-Status") != null) {
                    Log.d("GG", "onResponse: " + response.headers().get("status"));
                }

                List<ResultModel.DayList> resultModel = response.body().getList();

                String strin = "";

                for (ResultModel.DayList list : resultModel) {
                    Log.d("dd", "onResponse: " + list.toString());
                }
            }

            @Override
            public void onFailure(Call<ResultModel> call, Throwable t) {

            }
        });


    }
}
