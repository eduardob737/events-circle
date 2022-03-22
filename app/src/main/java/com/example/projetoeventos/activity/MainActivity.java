package com.example.projetoeventos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.projetoeventos.R;
import com.example.projetoeventos.fragments.EstabelecimentoFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentContainerView fragmentContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentContainerView = findViewById(R.id.fragmentContainerView);

        NavHostFragment finalHost = NavHostFragment.create(R.navigation.nav_graph_home);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, finalHost)
                .setPrimaryNavigationFragment(finalHost)// this is the equivalent to app:defaultNavHost="true"
                .commit();

    }
}