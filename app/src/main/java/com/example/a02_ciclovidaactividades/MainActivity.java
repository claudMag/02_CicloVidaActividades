package com.example.a02_ciclovidaactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //PASO 1- Variables vista
    private Button btnAbrir;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6- Ejecuto onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4- Ejecuto onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3- Ejecuto onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2- Ejecuto onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTAODS", "5-Ejecuto onStop");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ESTADOS", "1- Ejecuto onCreate");

        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Vehiculo Conductor --> Intent (El objeto encargado de avisar a Android de 2 cosas:
                1. Quien quiere abrir una ventana
                2. Que activity quiere abrir*/

                /*Tengo 2 tipos de INTENTS
                - IMPLICITOS --> abren actividades del sistema (Cámara, galeria, contactos, telefono..)
                - EXPLICITOS --> actividades propias */

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}