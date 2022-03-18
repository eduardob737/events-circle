package com.example.projetoeventos.model.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projetoeventos.model.Usuario;

public class ViewModelRegisterUser extends ViewModel {

    private Usuario user = new Usuario();

    //Fragment PF
    private MutableLiveData<String> _nomeCompleto = new MutableLiveData<>();
    public LiveData<String> nomeCompleto = _nomeCompleto;

    private  MutableLiveData<String> _cpf = new MutableLiveData<>();
    public LiveData<String> cpf = _cpf;

    private MutableLiveData<String> _dataNascimento = new MutableLiveData<>();
    public  LiveData<String> dataNascimento = _dataNascimento;

    private MutableLiveData<String> _email = new MutableLiveData<>();
    public LiveData<String> email = _email;

    private MutableLiveData<String> _senha = new MutableLiveData<>();
    public LiveData<String> senha = _senha;




    public void setNomeCompleto(String nomeCompleto) {
        this._nomeCompleto.setValue(nomeCompleto);
        user.setNome(nomeCompleto);
    }

    public void setCpf(String cpf) {
        this._cpf.setValue(cpf);
        user.setCpf(cpf);
    }

    public void setDataNascimento(String dataNascimento) {
        this._dataNascimento.setValue(dataNascimento);
        user.setDataNascimento(dataNascimento);
    }

    public void setEmail(String email) {
        this._email.setValue(email);
    }

    public void setSenha(String senha) {
        this._senha.setValue(senha);
    }
}
