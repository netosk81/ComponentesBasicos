package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view){

        EditText campoNome = findViewById(R.id.edtNome);
        EditText campoEmail = findViewById(R.id.edtEmail);
        TextView textResultado = findViewById(R.id.txtResultado);


        String nome = campoNome.getText().toString();
        textResultado.setText(nome);



    }

}