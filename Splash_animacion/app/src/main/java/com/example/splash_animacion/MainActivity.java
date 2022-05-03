package com.example.splash_animacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton chaqueta, dragon, fantasma, gundam, ninja, pokemon, rock, sakura, torii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chaqueta = findViewById(R.id.chaqueta);
        dragon = findViewById(R.id.dragon);
        fantasma = findViewById(R.id.fantasma);
        gundam = findViewById(R.id.gundam);
        ninja = findViewById(R.id.ninja);
        pokemon = findViewById(R.id.pokemon);
        rock = findViewById(R.id.rock);
        sakura = findViewById(R.id.sakura);
        torii = findViewById(R.id.torii);

        chaqueta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Chaqueta de cuero",Toast.LENGTH_SHORT).show();
            }
        });

        dragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Dragon",Toast.LENGTH_SHORT).show();
            }
        });

        fantasma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Fantasma",Toast.LENGTH_SHORT).show();
            }
        });

        gundam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Gundam",Toast.LENGTH_SHORT).show();
            }
        });

        ninja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ninja",Toast.LENGTH_SHORT).show();
            }
        });

        pokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Pokemon",Toast.LENGTH_SHORT).show();
            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Rock",Toast.LENGTH_SHORT).show();
            }
        });

        sakura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sakura",Toast.LENGTH_SHORT).show();
            }
        });

        torii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Torii",Toast.LENGTH_SHORT).show();
            }
        });
    }
}