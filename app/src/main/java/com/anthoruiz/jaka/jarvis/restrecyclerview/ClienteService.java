package com.anthoruiz.jaka.jarvis.restrecyclerview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * **********************
 * Copyright (c) 2015 - 2016 Anthony Juosse Ruiz Samaca, All rights reserved
 * <p/>
 * -
 * <p/>
 * -
 * Autor:		Anthony Juosse Ruiz Samaca
 * email:		ajruiz.cpp@gmail.com
 * Creado:   	08/09/2016
 * Proyecto: 	RestRecyclerView
 * **********************
 */
public interface ClienteService {

    @GET("/usuarios")
    Call<List<Cliente>> getCliente();

}
