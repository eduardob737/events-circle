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
import com.example.projetoeventos.databinding.FragmentPessoaJuridicaBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelRegisterEmpresa;

public class PessoaJuridicaFragment extends Fragment {

    private FragmentPessoaJuridicaBinding binding = null;
    private ViewModelRegisterEmpresa sharedViewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPessoaJuridicaBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(ViewModelRegisterEmpresa.class);
        binding.setViewModelRegister(sharedViewModel);

        binding.btnAvancar1.setOnClickListener(view1 ->{
            String nome = binding.txtNome.getText().toString();
            String cnpj = binding.txtCnpj.getText().toString();
            String razaoSocial = binding.txtRazaoSocial.getText().toString();

            if (!nome.isEmpty() && !cnpj.isEmpty() && !razaoSocial.isEmpty()){
                sharedViewModel.setNomeCompleto(nome);
                sharedViewModel.setCnpj(cnpj);
                sharedViewModel.setRazaoSocial(razaoSocial);

                NavHostFragment.findNavController(PessoaJuridicaFragment.this).
                        navigate(R.id.action_pessoaJuridicaFragment_to_finalRegisterEmpresaFragment);

            }else{

                if (nome.isEmpty()){
                    binding.txtNome.setError("Preencha corretamente o campo");
                }
                if (cnpj.isEmpty() || cnpj.chars().count() < 14){
                    binding.txtCnpj.setError("Preencha corretamente o campo");
                }
                if (razaoSocial.isEmpty()){
                    binding.txtRazaoSocial.setError("Preencha corretamente o campo");
                }
            }


        });

        binding.btnVoltar.setOnClickListener(view2 ->{
            NavHostFragment.findNavController(PessoaJuridicaFragment.this).navigate(R.id.action_pessoaJuridicaFragment_to_firstRegisterFragment);
        });
    }
}