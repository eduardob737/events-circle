package com.example.projetoeventos.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentHostCallback;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;

import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentConfirmarPresencaBinding;
import com.example.projetoeventos.databinding.FragmentEventoBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelHome;

import java.util.Objects;

public class ConfirmarPresencaFragment extends Fragment {

    private ViewModelHome viewModelHome = null;
    private FragmentConfirmarPresencaBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentConfirmarPresencaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModelHome = new ViewModelProvider(requireActivity()).get(ViewModelHome.class);


        binding.btnSim.setOnClickListener(view1 -> {
            closeFragment();
        });

        binding.btnNao.setOnClickListener(view1 ->{
            closeFragment();
        });

    }

    private void closeFragment() {
        NavHostFragment.findNavController(ConfirmarPresencaFragment.this).navigate(R.id.action_back_to_page_evento);
    }
}