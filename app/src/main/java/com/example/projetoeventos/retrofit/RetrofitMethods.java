package com.example.projetoeventos.retrofit;


import com.example.projetoeventos.model.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitMethods {

    @POST("usuarios/criar")
    Call<Usuario> usuarioPost(@Body Usuario user);

    @GET("usuarios/{id}")
    Call<Usuario> usuarioGet(@Path("id") Long id);

    @GET("usuarios/nome/{nome}")
    Call<Usuario> usuarioGetByNome(@Path("nome") String nome);

    @GET("usuarios/cpf/{cpf}")
    Call<Usuario> usuarioGetByCpf(@Path("cpf") String cpf);

    @DELETE("usuarios/delete")
    Call<Usuario> usuarioDelete(@Body Usuario user);

    @GET("usuarios/updade")
    Call<Usuario> usuarioUpdate(@Body Usuario update);

}


