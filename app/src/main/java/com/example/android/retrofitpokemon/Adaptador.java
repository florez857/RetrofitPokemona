package com.example.android.retrofitpokemon;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 17/02/2018.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.holder> {

    private ArrayList<Result> datos;


    public Adaptador() {
        this.datos = new ArrayList<>();

    }



    @Override
    public holder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));

    }

    @Override
    public void onBindViewHolder(holder holde, int position) {

            Result resultado=datos.get(position);
            holde.nombre.setText(resultado.getName());
            holde.url.setText(resultado.getUrl());

    }


    @Override
    public int getItemCount() {
        Log.e("cantidad",String.valueOf(datos.size()));
        return datos.size();

    }

    public void notifyDataSetChanged(List<Result> results) {
        datos.clear();
        datos.addAll(results);
        Log.e("cantodadad",String.valueOf(datos.size()));
        notifyDataSetChanged();

    }


    public class  holder extends RecyclerView.ViewHolder{

        private TextView nombre,url;

        public holder(View itemView) {
            super(itemView);

            this.nombre=itemView.findViewById(R.id.nombre);
            this.url=itemView.findViewById(R.id.url);

        }
    }
}
