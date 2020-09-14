package com.edisondeveloper.petagram.Modelo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface EndPointHeroku {

    @POST(Constantes.REGISTER_USER)
    Call<UsuarioFirebase> registerUser(@Body UsuarioFirebase user);

}
