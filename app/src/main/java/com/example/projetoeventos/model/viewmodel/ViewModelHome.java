package com.example.projetoeventos.model.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelHome extends ViewModel {

    // Tela de Eventos
    private MutableLiveData<Boolean> _confirmacaoPresenca = new MutableLiveData<>();
    public LiveData<Boolean> confirmacaoPresenca = _confirmacaoPresenca;

    public void set_confirmacaoPresenca(Boolean confirmacaoPresenca) {
        this._confirmacaoPresenca.setValue(confirmacaoPresenca);
    }

    public LiveData<Boolean> getConfirmacaoPresenca() {
        return confirmacaoPresenca;
    }

}



