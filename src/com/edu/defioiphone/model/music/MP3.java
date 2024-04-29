package com.edu.defioiphone.model.music;

import java.util.ArrayList;
import java.util.List;

public class MP3 {

    private  Artista artista;

    private List<Artista> artistas;

    public MP3() {
        artistas = new ArrayList<>();
    }

    public void addArtista(String nome) {
        this.artistas.add(new Artista(nome));
    }

    public String listarArtistas() {
        StringBuilder listaArtistas = new StringBuilder();
        for (Artista artista : artistas) {
            listaArtistas.append(artista).append("\n");
        }
        return listaArtistas.toString();
    }






}
