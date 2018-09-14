package com.example.a1.retrofittest;

public class ApiUtils {
    private static final String TAG = ApiUtils.class.getSimpleName();


    public static final String BASE_URL = "http://io-bed.net/api/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
