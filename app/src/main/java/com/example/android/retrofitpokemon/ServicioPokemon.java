package com.example.android.retrofitpokemon;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pc on 17/02/2018.
 */

public interface ServicioPokemon {

    //se define el end-point para la consulta
    @GET("pokemon")
    Call<Pokemons>  getPokemons();
    //
}
