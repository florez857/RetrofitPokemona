package com.example.android.retrofitpokemon;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pc on 17/02/2018.
 */

public class ApiCliente {

    private static Retrofit retrofit=null;

    public static Retrofit getClient(String Url){

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
