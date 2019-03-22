package com.example.edu.muiz;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[] datosImg;


    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView nombre = (TextView) vista.findViewById(R.id.nombre);
        TextView posicion = (TextView) vista.findViewById(R.id.posicion);
        TextView edad = (TextView) vista.findViewById(R.id.edad);
        TextView altura = (TextView) vista.findViewById(R.id.altura);

        ImageView foto = (ImageView) vista.findViewById(R.id.foto);

        nombre.setText("Nombre: " + datos[i] [0]);
        posicion.setText("Posición: " + datos [i] [1]);
        edad.setText("Edad: "+ datos [i][2] + " Años");
        altura.setText("Altura: " + datos [i] [3] + " m");

        foto.setImageResource(datosImg[i]);

                return vista;

    }

    public adaptador(Context contexto, String[][] datos, int[] imagenes)
    {
        this.contexto = contexto;
        this.datos = datos;
        this.datosImg = imagenes;
        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return datosImg.length;

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
