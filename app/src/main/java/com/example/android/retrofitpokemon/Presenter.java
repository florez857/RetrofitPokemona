package com.example.android.retrofitpokemon;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;

/**
 * Created by pc on 21/02/2018.
 */

public class Presenter {

    private MainActivity acitividad;
    ViewModelPokemons viewModelPokemons;

    public Presenter(final MainActivity actividad) {

        this.acitividad=actividad;
        viewModelPokemons= ViewModelProviders.of(actividad).get(ViewModelPokemons.class);
        //adaptador.notifyDataSetChanged( viewModelPokemons.getLista());
        viewModelPokemons.getLista();

        viewModelPokemons.getDatos().observe(actividad , new Observer<Pokemons>(
        ) {
            @Override
            public void onChanged(@Nullable Pokemons pokemons) {

                actividad.NotifiData(pokemons.getResults());
                //adaptador.notifyDataSetChanged(pokemons.getResults());

            }
        });

    }




}
