package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner genero = findViewById(R.id.spinner);
        genero.setOnItemSelectedListener(this);
        Spinner comunidad = findViewById(R.id.spinnerComu);
        comunidad.setOnItemSelectedListener(this);

        String generos [] = {
                "Hombre", "Mujer", "Helicoptero"
        };
        String comunidades [] = {
          "Andalucia", "Aragon", "Asturias", "Islas Baleares", "Canarias", "Cantabria", "Castilla y Leon", "Castilla-La Mancha", "Comunidad Valenciana", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", "Pais Vasco", "La Rioja", "Ceuta", "Melilla"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, generos);
        genero.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, comunidades);
        comunidad.setAdapter(adapter1);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}