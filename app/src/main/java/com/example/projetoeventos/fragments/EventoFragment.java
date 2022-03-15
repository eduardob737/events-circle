package com.example.projetoeventos.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentEventoBinding;

public class EventoFragment extends Fragment {

    private FragmentEventoBinding binding = null;
    private HomeViewModel viewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentEventoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }















}