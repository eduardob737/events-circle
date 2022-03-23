package com.example.projetoeventos.model.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projetoeventos.model.Usuario;
import com.example.projetoeventos.model.enums.TipoCliente;
import com.example.projetoeventos.retrofit.RetrofitMethods;
import com.example.projetoeventos.retrofit.RetrofitService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    public void setEmail(String email) {
        this._email.setValue(email);
        user.setEmail(email);
    }

    public void setSenha(String senha) {
        this._senha.setValue(senha);
        user.setSenha(senha);
    }

    public void registerUser() {
        user.setTipoCliente(TipoCliente.ESPECTADOR);
        user.setUrl("sdfsdf");
        user.setTelefone("999078787");
        //Call<Usuario> usuarioCall = RetrofitService.getRetrofitMethods().createUser(user);
        RetrofitMethods methods = RetrofitService.getRetrofitInstance().create(RetrofitMethods.class);
        //Call<Usuario> usuarioCall = RetrofitService.getRetrofitMethods().createUser(user);
        Call<Usuario> usuarioCall = methods.createUser(user);
        usuarioCall.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                if(response.isSuccessful()){
                    user = response.body();
                    Log.d("Register", String.valueOf(response.code()));
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                Log.d("Register", String.valueOf(t.toString() + "\n" + t.getCause()));
            }
        });
    }
}
