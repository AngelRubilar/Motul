package com.example.motul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //creamos el boton para poder listar las categorias de lubricantes
    Button btn_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        establecerlisteners();
    }

    private void establecerlisteners() {
        btn_principal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intento = new Intent(MainActivity.this,listarActivity.class);
    }
}