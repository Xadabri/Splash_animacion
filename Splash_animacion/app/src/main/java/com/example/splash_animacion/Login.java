package com.example.splash_animacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void crearCuenta(View view) {
        Intent intent = new Intent(Login.this, CrearCuenta.class);
        startActivity(intent);
    }

    public void inicarSesion(View view) {
    }
}