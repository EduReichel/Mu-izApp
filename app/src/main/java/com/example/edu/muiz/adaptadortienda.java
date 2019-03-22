package com.example.edu.muiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptadortienda extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context  contexto;
    String[][] datos_tienda;
    int[] datosImg_tienda;



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.elementotienda, null);

        TextView producto = (TextView) vista.findViewById(R.id.producto);
        TextView desc = (TextView) vista.findViewById(R.id.desc);
        TextView precio = (TextView) vista.findViewById(R.id.precio);

        ImageView foto = (ImageView) vista.findViewById(R.id.foto_tienda);

        producto.setText( datos_tienda[i] [0]);
        desc.setText("Descripción: " + datos_tienda [i] [1]);
        precio.setText("Precio: "+ datos_tienda [i][2] + "$");

        foto.setImageResource(datosImg_tienda[i]);

        return vista;
    }


    @Override
    public int getCount() {
        return datosImg_tienda.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    public adaptadortienda (Context contexto, String[][] datos_tienda, int[] imagenes )
    {
        this.contexto = contexto;
        this.datos_tienda = datos_tienda;
        this.datosImg_tienda = imagenes;
        inflater = (LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }
}
