package com.example.projetoeventos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetoeventos.R;
import com.example.projetoeventos.model.Evento;

import java.util.List;

public class EventoPequenoAdapter extends RecyclerView.Adapter<EventoPequenoAdapter.MyViewHolder>{

    private List<Evento> dataSet;

    public EventoPequenoAdapter() {
    }

    public EventoPequenoAdapter(List<Evento> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.evento_item_pequeno, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtDia, txtMes, txtHora, txtCidade, txtTitulo;
        ImageView imgFavorito, imgLocal;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtDia = itemView.findViewById(R.id.evento_data_dia);
            txtMes = itemView.findViewById(R.id.evento_data_mes);
            txtHora = itemView.findViewById(R.id.evento_hora);
            txtCidade = itemView.findViewById(R.id.evento_cidade);
            txtTitulo = itemView.findViewById(R.id.evento_titulo);
            imgFavorito = itemView.findViewById(R.id.img_favorito);
            imgLocal = itemView.findViewById(R.id.image);
        }
    }
}
