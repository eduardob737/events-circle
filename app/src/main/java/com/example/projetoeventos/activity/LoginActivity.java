package com.example.projetoeventos.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.projetoeventos.R;

import com.example.projetoeventos.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        binding.getRoot();

        binding.btnEntrar.setOnClickListener(view -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });

        binding.txtCriaConta.setOnClickListener(view -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });
    }

}