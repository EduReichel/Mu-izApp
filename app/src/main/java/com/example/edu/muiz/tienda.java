package com.example.edu.muiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class tienda extends AppCompatActivity {

    ListView lista_tienda;

    String [] [] datos_tienda = {
            {"Remra", "Algodon. Talle s/l/m/xl", "250"},
            {"Remra", "Algodon. Talle s/l/m/xl", "250"},
            {"Remra", "Algodon. Talle s/l/m/xl", "250"}
    };

    int[] datosImg_tienda = {R.drawable.diego, R.drawable.diego, R.drawable.diego};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);

        lista_tienda = (ListView) findViewById(R.id.list_tienda);
        lista_tienda.setAdapter(new adaptador(this, datos_tienda, datosImg_tienda));
    }
}
