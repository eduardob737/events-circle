package com.example.projetoeventos.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoeventos.R;
import com.example.projetoeventos.adapter.EventoGrandeAdapter;
import com.example.projetoeventos.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EventoGrandeAdapter adapter = new EventoGrandeAdapter();
        binding.recyclerEventosDaSemana.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recyclerEventosDaSemana.setAdapter(adapter);
    }
}