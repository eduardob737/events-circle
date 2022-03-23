package com.example.projetoeventos.model.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projetoeventos.model.Evento;
import com.example.projetoeventos.model.Usuario;

import java.util.List;

public class ViewModelHome extends ViewModel {

    private Usuario currentUser;

    private MutableLiveData<String> _nome = new MutableLiveData<>();
    public LiveData<String> nome = _nome;

}
