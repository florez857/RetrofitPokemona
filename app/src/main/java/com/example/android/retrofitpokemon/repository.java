package com.example.android.retrofitpokemon;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pc on 21/02/2018.
 */

public class repository {

    private ServicioPokemon service;
    public String Url="https://pokeapi.co/api/v2/";
    private Pokemons data;

 public LiveData<Pokemons> getPublish() {

   final   MutableLiveData<Pokemons> datos= new MutableLiveData<>();
     service = ApiCliente.getClient(Url).create(ServicioPokemon.class);
     service.getPokemons().enqueue(new Callback<Pokemons>() {
         @Override
         public void onResponse(Call<Pokemons> call, Response<Pokemons> response) {
             if (response.isSuccessful()) {

                 Pokemons data = response.body();

                 datos.setValue(data);

                 Log.e("retrofit","retrofit");
                 //adaptador.notifyDataSetChanged(data.getResults());

             }
         }

         @Override
         public void onFailure(Call<Pokemons> call, Throwable t) {

         }
     });
   return datos;
 }
}
