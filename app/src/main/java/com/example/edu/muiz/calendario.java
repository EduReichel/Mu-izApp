package com.example.edu.muiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class calendario extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("fixture.pdf").load();

    }



}
