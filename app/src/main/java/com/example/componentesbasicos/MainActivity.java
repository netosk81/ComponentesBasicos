package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;
    private RadioButton sexoMasc, sexoFem;
    private RadioGroup opcaosexo;

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

        sexoMasc        = findViewById(R.id.radioMasc);
        sexoFem         = findViewById(R.id.radioFem);
        opcaosexo       = findViewById(R.id.radioGrSex);

        radioButton();

    }

    public void radioButton(){

        opcaosexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                
                if (checkedId == R.id.radioMasc){
                    textResultado.setText("Masculino");
                } else if (checkedId == R.id.radioFem) {
                    textResultado.setText("Feminino");
                }

            }
        });



        /*
        if (sexoMasc.isChecked()){
            textResultado.setText("Masculino");
        }else if (sexoFem.isChecked()){
            textResultado.setText("Feminino");
        }
         */
    }


    public void enviar(View view){

        //radioButton();
        //checkBox();
        //String nome = campoNome.getText().toString();
        //String email = campoEmail.getText().toString();
        //textResultado.setText("Nome: " + nome + " \n " + "Email: " + email);

    }

    public void checkBox(){

        String texto = "";
        //String corSelecionada = checkVerde.getText().toString();
        //texto = corSelecionada;

       /*   boolean resultadoVerde = checkVerde.isChecked();
            textResultado.setText("Verde: " + resultadoVerde);
            boolean resultadoBranco = checkBranco.isChecked();
            textResultado.setText("Branco: " + resultadoBranco);
            boolean resultadoVermelho = checkVermelho.isChecked();
            textResultado.setText("Vermelho: " + resultadoVermelho);
        */

        if (checkVerde.isChecked()){
            //String corSelecionada = checkVerde.getText().toString();
            //texto = corSelecionada;
            texto = "Verde Selecionado - ";
        }
        if (checkBranco.isChecked()){
            texto = texto + "Branco Selecionado - ";
        }
        if (checkVermelho.isChecked()){
            texto = texto + "Vermelho Selecionado - ";
        }

        textResultado.setText( texto );


    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");

    }

}