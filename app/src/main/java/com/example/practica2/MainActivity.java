package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    ImageButton avatar1, avatar2, avatar3, avatar4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner genero = findViewById(R.id.spinner);
        genero.setOnItemSelectedListener(this);
        Spinner comunidad = findViewById(R.id.spinnerComu);
        comunidad.setOnItemSelectedListener(this);

        avatar1 = findViewById(R.id.avatar1);
        avatar1.setOnClickListener(this);
        avatar2 = findViewById(R.id.avatar2);
        avatar2.setOnClickListener(this);
        avatar3 = findViewById(R.id.avatar3);
        avatar3.setOnClickListener(this);
        avatar4 = findViewById(R.id.avatar4);
        avatar4.setOnClickListener(this);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.avatar1:
                avatar1.getBackground().setAlpha(255);
                avatar2.getBackground().setAlpha(128);
                avatar3.getBackground().setAlpha(128);
                avatar4.getBackground().setAlpha(128);
                break;
            case R.id.avatar2:
                avatar1.getBackground().setAlpha(128);
                avatar2.getBackground().setAlpha(255);
                avatar3.getBackground().setAlpha(128);
                avatar4.getBackground().setAlpha(128);
                break;
            case R.id.avatar3:
                avatar1.getBackground().setAlpha(128);
                avatar2.getBackground().setAlpha(128);
                avatar3.getBackground().setAlpha(255);
                avatar4.getBackground().setAlpha(128);
                break;
            case R.id.avatar4:
                avatar1.getBackground().setAlpha(128);
                avatar2.getBackground().setAlpha(128);
                avatar3.getBackground().setAlpha(128);
                avatar4.getBackground().setAlpha(255);
                break;
            /*case R.id.button:
                Toast toast = Toast.makeText(this, "Datos guardados", Toast.LENGTH_SHORT);
                toast.show();
                break;*/
        }
    }
}