package com.example.suratpendekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button annas, alfalaq, alikhlas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        annas = findViewById(R.id.annas);
        alfalaq = findViewById(R.id.alfalaq);
        alikhlas = findViewById(R.id.alIkhlas);

        annas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent annas = new Intent(MainActivity.this, Annas.class);
                startActivity(annas);
            }
        });

        alfalaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alfalaq = new Intent(MainActivity.this, AlFalaq.class);
                startActivity(alfalaq);
            }
        });

        alikhlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alikhlas = new Intent(MainActivity.this, AlIkhlas.class);
                startActivity(alikhlas);
            }
        });
    }
}
