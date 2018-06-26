package com.example.sandeco.meuprimeirodb.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.sandeco.meuprimeirodb.R;

import model.Pessoa;
import persist.DAO.FabricaDAO;
import persist.DAO.PessoaDAO;
import persist.DatabaseHelper;
import persist.SQLiteDAO.PessoaDaoSqlite;
import service.MyService;
import util.MyApp;

public class MainActivity extends AppCompatActivity {

    private DatabaseHelper db;
    private PessoaDAO pessoaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarService();



        pessoaDAO = FabricaDAO.criarPessoaDao();

        Pessoa p = new Pessoa();
        p.setNome("sandeco");

        long id = pessoaDAO.salvar(p);

        if(id!=-1){
            Toast.makeText(this,"Pessoa salva com sucesso",Toast.LENGTH_LONG);
        }else{
            Toast.makeText(this,"Erro ao grava pessoa",Toast.LENGTH_LONG);
        }
    }


    private void iniciarService(){
        Intent intent = new Intent(this, MyService.class);
        MyApp.getContext().startService(intent);
    }


}
