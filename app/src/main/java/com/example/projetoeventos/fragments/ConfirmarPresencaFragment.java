package com.example.projetoeventos.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentConfirmarPresencaBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelHome;

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



    }
}