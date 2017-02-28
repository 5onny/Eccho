package com.example.sburmeis.eccho.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.sburmeis.eccho.Faq.Faq;
import com.example.sburmeis.eccho.Profil.Profil;
import com.example.sburmeis.eccho.R;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void initProfil(View view){ startActivity(new Intent(this, Profil.class));}

    public void initFaq(View view){ startActivity(new Intent(this, Faq.class));}

}
