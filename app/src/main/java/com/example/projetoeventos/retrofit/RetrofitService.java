package com.example.projetoeventos.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private static final String BASE_URL =
            "http://192.168.0.106:8080/api/";

    private static Retrofit retrofit = null;
    private static RetrofitMethods methods = null;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(new Gson()))
                    .build();
        }
        return retrofit;
    }

    public static RetrofitMethods getRetrofitMethods() {
        if(methods == null)
            methods = getRetrofitInstance().create(RetrofitMethods.class);
        return methods;
    }
}