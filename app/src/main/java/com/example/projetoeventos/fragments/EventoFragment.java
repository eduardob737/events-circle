package com.example.projetoeventos.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentEventoBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelHome;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class EventoFragment extends Fragment {

    private FragmentEventoBinding binding = null;
    private ViewModelHome viewModel = null;
    private boolean favorite = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentEventoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(ViewModelHome.class);
        verificaConfirmacao();

        binding.btnConfirmarPresenca.setOnClickListener(view1 -> {
            verificaConfirmacao();

        });

        binding.btnCancelarPresenca.setOnClickListener(view1 -> {
            replaceFragment(new ConfirmarPresencaFragment());
        });

        String nomeEvento = binding.nomeEvento.getText().toString();

        binding.btnFavoritar.setOnClickListener(view1 -> {
            if (!favorite) {
                binding.btnFavoritar.setBackgroundResource(R.drawable.ic_coracao_preenchido);
                favorite = true;
                Snackbar.make(binding.getRoot(),nomeEvento+ " adicionado aos Favoritos", Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(getResources().getColor(R.color.verdeEscuro))
                        .setTextColor(getResources().getColor(R.color.white))
                        .show();
            } else {
                binding.btnFavoritar.setBackgroundResource(R.drawable.ic_coracao_contornado);
                favorite = false;
                Snackbar.make(binding.getRoot(),nomeEvento+ " removido dos Favoritos", Snackbar.LENGTH_SHORT)
                        .setBackgroundTint(getResources().getColor(R.color.vermelho))
                        .setTextColor(getResources().getColor(R.color.white))
                        .show();
            }
        });

        binding.swipeRefresh.setOnRefreshListener(() -> {
        });

    }

    private void verificaConfirmacao(){
    }

    private void replaceFragment(ConfirmarPresencaFragment confirmarPresencaFragment) {
        binding.btnCancelarPresenca.setVisibility(View.INVISIBLE);
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, confirmarPresencaFragment);
        fragmentTransaction.commit();

    }

}