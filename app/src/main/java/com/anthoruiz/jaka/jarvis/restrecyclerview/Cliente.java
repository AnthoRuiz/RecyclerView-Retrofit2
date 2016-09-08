package com.anthoruiz.jaka.jarvis.restrecyclerview;

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
public class Cliente {
    private int id;
    private String nombre;
    private String sexo;
    private String correo;
    private String celular;

    public Cliente(int id, String nombre, String correo, String celular, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.sexo = sexo;
    }

    public Cliente() {
        this.id = -1;
        this.nombre = null;
        this.correo = null;
        this.celular = null;
        this.sexo = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", correo='" + correo + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
