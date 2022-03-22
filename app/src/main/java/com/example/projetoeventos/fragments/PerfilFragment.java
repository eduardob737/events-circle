package com.example.projetoeventos.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoeventos.R;
import com.example.projetoeventos.activity.HomeActivity;
import com.example.projetoeventos.databinding.FragmentPerfilBinding;

public class PerfilFragment extends Fragment {

    FragmentPerfilBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPerfilBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}