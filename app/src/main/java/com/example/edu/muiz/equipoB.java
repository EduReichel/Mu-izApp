package com.example.edu.muiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class equipoB extends AppCompatActivity {


    ListView lista2;

    String [] [] datos = {
            {"Reichel Eduardo", "Extremo", "25", "1.63"},
            {"Riboldi Lucas", "Central", "25", "1.73"},
            {"Pablo Baffetti", "Extremo", "31", "1.75"}
    };

    int[] datosImg = {R.drawable.diego, R.drawable.luka, R.drawable.diego};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipo_b);

        lista2 = (ListView) findViewById(R.id.lista2);




        lista2.setAdapter(new adaptador(this, datos, datosImg));


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }



}
