package com.example.motul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class listarActivity extends AppCompatActivity {

    //crear los botones y luego utilizar el case para poder identificar que boton es el que se presiono

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
    }
}