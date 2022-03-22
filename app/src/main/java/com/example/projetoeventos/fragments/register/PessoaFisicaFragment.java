package com.example.projetoeventos.fragments.register;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentPessoaFisicaBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelRegisterUser;

public class PessoaFisicaFragment extends Fragment {

    private FragmentPessoaFisicaBinding binding = null;
    private ViewModelRegisterUser sharedViewModel = null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPessoaFisicaBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(ViewModelRegisterUser.class);
        binding.setViewModelRegister(sharedViewModel);

        binding.btnAvancar2.setOnClickListener(view1 ->{
            String nome = binding.txtNome.getText().toString();
            String cpf = binding.txtCpf.getText().toString();
            String dataNascimento = binding.txtDataNascimento.getText().toString();

            if (!nome.isEmpty() && !cpf.isEmpty() && !dataNascimento.isEmpty()){
            sharedViewModel.setNomeCompleto(nome);
            sharedViewModel.setCpf(cpf);
            sharedViewModel.setDataNascimento(dataNascimento);

            NavHostFragment.findNavController(PessoaFisicaFragment.this).
                    navigate(R.id.action_pessoaFisicaFragment_to_finalRegisterFragment);

            }else{

                if (nome.isEmpty()){
                    binding.txtNome.setError("Preencha corretamente o campo");
                }
                if (cpf.isEmpty() || cpf.chars().count() < 11){
                    binding.txtCpf.setError("Preencha corretamente o campo");
                }
                if (dataNascimento.isEmpty()){
                    binding.txtDataNascimento.setError("Preencha corretamente o campo");
                }
            }


        });

        binding.btnVoltar.setOnClickListener(view2 ->{
            NavHostFragment.findNavController(PessoaFisicaFragment.this).navigate(R.id.action_pessoaFisicaFragment_to_firstRegisterFragment);
        });

    }
}