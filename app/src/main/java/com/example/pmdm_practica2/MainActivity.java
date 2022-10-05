package com.example.pmdm_practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.pmdm_practica2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.EntrenarBtn.setOnClickListener(v ->{
            String Email = binding.EmailEt.getText().toString();

           abrirLogin(Email);
        });




    }

  private void abrirLogin(String Email) {
      //Login login = new Login();
      Intent irALogin= new Intent(this,Login.class);
      irALogin.putExtra("Login",Email);
      startActivity(irALogin);
    }


}