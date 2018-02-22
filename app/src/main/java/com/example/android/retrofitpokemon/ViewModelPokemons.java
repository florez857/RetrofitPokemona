package com.example.android.retrofitpokemon;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Created by pc on 21/02/2018.
 */

public class ViewModelPokemons extends ViewModel {

    LiveData<Pokemons> lista ;
    repository repositorio;

    public ViewModelPokemons() {
        repositorio =new  repository();
    }

    public void getLista(){
        if(lista==null) {
            lista = repositorio.getPublish();
        }
    }

    public LiveData<Pokemons> getDatos(){
        return lista;
    }

}
