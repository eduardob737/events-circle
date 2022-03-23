package com.example.projetoeventos.fragments.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentFirstRegisterBinding;
import com.example.projetoeventos.model.Usuario;

public class FirstRegisterFragment extends Fragment {

    private FragmentFirstRegisterBinding binding = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstRegisterBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.checkPessoaFisica.setOnClickListener(view3 ->{
            if (binding.checkPessoaFisica.isChecked()){
                binding.checkEmpresa.setChecked(false);
            }
        });

        binding.checkEmpresa.setOnClickListener(view3 ->{
            if (binding.checkEmpresa.isChecked()){
                binding.checkPessoaFisica.setChecked(false);
            }
        });

        binding.btnContinuar.setOnClickListener(view1 -> {
            pessoaFisica();
            pessoaJuridica();
        });

        binding.btnVoltar.setOnClickListener(view2 ->{
           // NavHostFragment.findNavController(FirstRegisterFragment.this).navigate(R.id.action_pessoaFisicaFragment_to_finalRegisterFragment);
        });
    }



private void pessoaJuridica() {
    if (binding.checkEmpresa.isChecked()) {
        NavHostFragment.findNavController(FirstRegisterFragment.this).navigate(R.id.action_firstRegisterFragment_to_pessoaJuridicaFragment);
    }
}

    private void pessoaFisica() {
        if (binding.checkPessoaFisica.isChecked()){
            NavHostFragment.findNavController(FirstRegisterFragment.this).navigate(R.id.action_firstRegisterFragment_to_pessoaFisicaFragment);
        }
    }
}