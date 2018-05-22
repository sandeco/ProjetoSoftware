package com.example.sandeco.meuprimeirodb.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sandeco.meuprimeirodb.R;

import persist.DAO.FabricaDAO;
import persist.DAO.PessoaDAO;
import persist.DatabaseHelper;
import persist.SQLiteDAO.PessoaDaoSqlite;

public class MainActivity extends AppCompatActivity {

    private DatabaseHelper db;
    private PessoaDAO pessoaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FabricaDAO fabricaDAO = new FabricaDAO();


        db = DatabaseHelper.getInstance(this);
        pessoaDAO = FabricaDAO.criarPessoaDao();

        db = DatabaseHelper.getInstance(this);



    }
}
