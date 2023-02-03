package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.edtNome);
        campoEmail      = findViewById(R.id.edtEmail);
        textResultado   = findViewById(R.id.txtResultado);

        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

    }

    public void checkBox(){

        boolean resultadoVerde = checkVerde.isChecked();
        textResultado.setText("Verde: " + resultadoVerde);

        boolean resultadoBranco = checkBranco.isChecked();
        textResultado.setText("Branco: " + resultadoBranco);

        boolean resultadoVermelho = checkVermelho.isChecked();
        textResultado.setText("Vermelho: " + resultadoVermelho);


    }

    public void enviar(View view){

        checkBox();

        //String nome = campoNome.getText().toString();
        //String email = campoEmail.getText().toString();
        //textResultado.setText("Nome: " + nome + " \n " + "Email: " + email);

    }
    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");

    }

}