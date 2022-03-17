package com.example.projetoeventos.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoeventos.R;
import com.example.projetoeventos.adapter.EventoGrandeAdapter;
import com.example.projetoeventos.adapter.EventoPequenoAdapter;
import com.example.projetoeventos.databinding.FragmentPesquisaBinding;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.divider.MaterialDividerItemDecoration;

public class PesquisaFragment extends Fragment {

    private FragmentPesquisaBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPesquisaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EventoPequenoAdapter adapter = new EventoPequenoAdapter();
        //Adicionando divider no RecyclerView
        /*
        MaterialDividerItemDecoration divider = new MaterialDividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL);
        divider.setDividerColor(ContextCompat.getColor(requireContext(), R.color.white));
        binding.recyclerEventosDisponiveis.addItemDecoration(divider);

         */
        binding.recyclerEventosDisponiveis.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false));
        binding.recyclerEventosDisponiveis.setAdapter(adapter);
    }
}