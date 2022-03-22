package com.example.projetoeventos.model.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projetoeventos.model.Empresa;

public class ViewModelRegisterEmpresa extends ViewModel {

    Empresa empresa = new Empresa();

    //Fragment PJ

    private MutableLiveData<String> _nomeCompleto = new MutableLiveData<>();
    public LiveData<String> nomeCompleto = _nomeCompleto;

    private MutableLiveData<String> _cnpj = new MutableLiveData<>();
    public LiveData<String> cnpj = _cnpj;

    private MutableLiveData<String> _razaoSocial = new MutableLiveData<>();
    public  LiveData<String> razaoSocial = _razaoSocial;

    private MutableLiveData<String> _nomeFantasia = new MutableLiveData<>();
    public  LiveData<String> nomeFantasia = _nomeFantasia;

    private MutableLiveData<String> _email = new MutableLiveData<>();
    public LiveData<String> email = _email;

    private MutableLiveData<String> _senha = new MutableLiveData<>();
    public LiveData<String> senha = _senha;


    public void setNomeCompleto(String nomeCompleto) {
        this._nomeCompleto.setValue(nomeCompleto);
        empresa.setNome(nomeCompleto);
    }

    public void setCnpj(String cnpj) {
        this._cnpj.setValue(cnpj);
        empresa.setCnpj(cnpj);
    }

    public void setRazaoSocial(String razaoSocial) {
        this._razaoSocial.setValue(razaoSocial);
        empresa.setRazaoSocial(razaoSocial);
    }

    public void setNomeFantasia(String nomeFantasia) {
        this._nomeFantasia.setValue(nomeFantasia);
    }

    public void setEmail(String email) {
        this._email.setValue(email);
        empresa.setEmail(email);
    }

    public void setSenha(String senha) {
        this._senha.setValue(senha);
        empresa.setSenha(senha);
    }
}
