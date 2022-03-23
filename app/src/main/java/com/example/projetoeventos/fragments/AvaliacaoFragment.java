package com.example.projetoeventos.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.EstabelecimentoItemBinding;
import com.example.projetoeventos.databinding.FragmentAvaliacaoBinding;
import com.example.projetoeventos.databinding.FragmentEstabelecimentoBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelHome;
import com.google.android.material.snackbar.Snackbar;

public class AvaliacaoFragment extends Fragment {

    private ViewModelHome viewModelHome = null;
    private FragmentAvaliacaoBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAvaliacaoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModelHome = new ViewModelProvider(requireActivity()).get(ViewModelHome.class);

        binding.btnFechar.setOnClickListener(view1 -> {
            closeFragment();
        });

        binding.btnEnviarAvaliacao.setOnClickListener(view1 -> {
            if (binding.estrelasNovaAvaliacao.getRating() == 0){
                Snackbar.make(binding.getRoot(),"Selecione pelo menos 1 estrela", Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(getResources().getColor(R.color.vermelho))
                        .setTextColor(getResources().getColor(R.color.white))
                        .show();
            } else {
                Snackbar.make(binding.getRoot(),"Obrigado! Sua avaliação foi registrada com sucesso", Snackbar.LENGTH_LONG)
                        .setBackgroundTint(getResources().getColor(R.color.verdeEscuro))
                        .setTextColor(getResources().getColor(R.color.white))
                        .show();
                closeFragment();
            }
        });

    }

    private void closeFragment() {
        NavHostFragment.findNavController(AvaliacaoFragment.this).navigate(R.id.action_back_to_page_estabelecimento);

    }
}