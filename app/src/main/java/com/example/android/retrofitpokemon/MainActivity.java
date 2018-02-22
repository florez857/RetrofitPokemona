package com.example.android.retrofitpokemon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recycler;
    private Adaptador adaptador;
    private Presenter presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (presentador==null){
            presentador=new Presenter(this);
        }

        adaptador=new Adaptador();
        recycler=(RecyclerView)findViewById(R.id.recycler);
        recycler.setAdapter(adaptador);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);
    }


    public void NotifiData(List<Result> resultado){
        adaptador.notifyDataSetChanged(resultado);
    }
}
