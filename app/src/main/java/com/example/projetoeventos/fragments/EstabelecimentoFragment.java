package com.example.projetoeventos.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentConfirmarPresencaBinding;
import com.example.projetoeventos.databinding.FragmentEstabelecimentoBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelHome;
import com.google.android.material.snackbar.Snackbar;

public class EstabelecimentoFragment extends Fragment {

    private ViewModelHome viewModelHome = null;
    public FragmentEstabelecimentoBinding binding;
    public Boolean favorite = false;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentEstabelecimentoBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModelHome = new ViewModelProvider(requireActivity()).get(ViewModelHome.class);

        binding.btnAvaliarLocal.setOnClickListener(view1 -> {
            replaceFragment(new AvaliacaoFragment());
        });

        String nomeEstabelecimento = binding.nomeEtbl.getText().toString();

        binding.btnFavoritar.setOnClickListener(view1 -> {
            if (!favorite) {
                binding.btnFavoritar.setBackgroundResource(R.drawable.ic_coracao_preenchido);
                favorite = true;
                Snackbar.make(binding.getRoot(),nomeEstabelecimento+ " adicionado aos Favoritos", Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(getResources().getColor(R.color.verdeEscuro))
                        .setTextColor(getResources().getColor(R.color.white))
                        .show();
            } else {
                binding.btnFavoritar.setBackgroundResource(R.drawable.ic_coracao_contornado);
                favorite = false;
                Snackbar.make(binding.getRoot(), nomeEstabelecimento+ " removido dos Favoritos", Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(getResources().getColor(R.color.vermelho))
                        .setTextColor(getResources().getColor(R.color.white))
                        .show();
            }
        });

        binding.btnVoltar.setOnClickListener(view1 -> {
        });

    }

    private void replaceFragment(AvaliacaoFragment avaliacaoFragment) {
        binding.btnFavoritar.setVisibility(View.INVISIBLE);
        binding.btnVoltar.setVisibility(View.INVISIBLE);
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, avaliacaoFragment);
        fragmentTransaction.commit();
    }

}