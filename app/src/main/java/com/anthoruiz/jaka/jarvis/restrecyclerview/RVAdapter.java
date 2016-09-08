package com.anthoruiz.jaka.jarvis.restrecyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

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
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ClienteViewHolder>{

    public static class ClienteViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView clienteId;
        TextView clienteNombre;
        TextView clienteSexo;
        TextView clienteCorreo;
        TextView clienteCel;

        ClienteViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            clienteId = (TextView)itemView.findViewById(R.id.cliente_id);
            clienteNombre = (TextView)itemView.findViewById(R.id.cliente_nombre);
            clienteSexo = (TextView)itemView.findViewById(R.id.cliente_sexo);
            clienteCorreo = (TextView)itemView.findViewById(R.id.cliente_correo);
            clienteCel = (TextView)itemView.findViewById(R.id.cliente_cel);
        }
    }

    List<Cliente> clienteList;

    RVAdapter(List<Cliente> Clientes){
        this.clienteList = Clientes;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ClienteViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        ClienteViewHolder pvh = new ClienteViewHolder(v);
        return pvh;
    }


    @Override
    public void onBindViewHolder(ClienteViewHolder clienteViewHolder, int i) {

        clienteViewHolder.clienteId.setText(String.valueOf(clienteList.get(i).getId()));
        clienteViewHolder.clienteNombre.setText(clienteList.get(i).getNombre());
        clienteViewHolder.clienteSexo.setText(clienteList.get(i).getSexo());
        clienteViewHolder.clienteCorreo.setText(clienteList.get(i).getCorreo());
        clienteViewHolder.clienteCel.setText(clienteList.get(i).getCelular());

    }

    @Override
    public int getItemCount() {
        return clienteList.size();
    }

}