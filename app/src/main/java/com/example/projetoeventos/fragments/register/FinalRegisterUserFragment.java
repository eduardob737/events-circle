package com.example.projetoeventos.fragments.register;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetoeventos.R;
import com.example.projetoeventos.databinding.FragmentFinalRegisterUserBinding;
import com.example.projetoeventos.model.viewmodel.ViewModelRegisterUser;

public class FinalRegisterUserFragment extends Fragment {

    private FragmentFinalRegisterUserBinding binding = null;
    private ViewModelRegisterUser sharedViewModel = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFinalRegisterUserBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sharedViewModel = new ViewModelProvider(requireActivity()).get(ViewModelRegisterUser.class);
        binding.setViewModelRegister(sharedViewModel);

        binding.confirmarCadastro.setOnClickListener(view1 ->{
            String email = binding.txtEmail.getText().toString();
            String senha = binding.txtSenha.getText().toString();
            String senhaConfirmada = binding.txtConfirmaSenha.getText().toString();

            if (!email.isEmpty() && !senha.isEmpty() && !senhaConfirmada.isEmpty() && senha == senhaConfirmada) {
                sharedViewModel.setEmail(email);
                sharedViewModel.setSenha(senha);

                //TODO NAVGRAPH PROXIMA PAGINA

            }else{
                if(email.isEmpty()){
                    binding.txtEmail.setError("Preencha o campo");
                }
                if (senha.isEmpty()){
                    binding.txtSenha.setError("Preencha o campo");
                }
                if (senhaConfirmada != senha){
                    binding.txtConfirmaSenha.setError("Senha divergente da anterior");
                }
            }



        });

        binding.btnVoltar.setOnClickListener(view2 ->{
            NavHostFragment.findNavController(FinalRegisterUserFragment.this).navigate(R.id.action_finalRegisterFragment_to_pessoaFisicaFragment);
        });
    }
}