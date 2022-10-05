package com.example.pmdm_practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pmdm_practica2.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = ActivityLoginBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        Bundle extras = getIntent().getExtras();
        Login login = extras.getParcelable("Login");

        String emailLog = getIntent().getStringExtra("Login");

        binding.BienvenidaTv.setText("Bienvenido " + emailLog );



    }
}