package com.example.alunos.adr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alunos.adr.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public void showList(View v) {
        Intent it = new Intent(this, mostraListaDinamica.class);
        it.putParcelableArrayListExtra("lista", lista);
        startActivity(it);
    }

    public void salvar(View v){
      
        EditText nome = (EditText)findViewById(R.id.inputNome);
        String nome = nome.getText().toString();

        EditText telefone = (EditText)findViewById(R.id.inputTelefone);
        String telefone = telefone.getText().toString();

        EditText idade= (EditText)findViewById(R.id.inputIdade);
        int idade = idade.getText().toString();

        if(nome.compareTo("")!=0){
            if(telefone.compareTo("")!=0){
                if(idade_string.compareTo("")!=0){
                    int idade = Integer.parseInt(idade.getText().toString());
                    lista.add(new Pessoa(nome, telefone, idade));

                    nome_s.setText("");
                    telefone_s.setText("");
                    idade_s.setText("");
                }
            }
        }

    }
}
