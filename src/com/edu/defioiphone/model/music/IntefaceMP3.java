package com.edu.defioiphone.model.music;

import java.util.ArrayList;
import java.util.List;

public class IntefaceMP3 {

    private  Artista artista;

    private final List<Artista> artistas;

    public IntefaceMP3() {
        artistas = new ArrayList<>();
    }

    public void addArtista(Artista nome) {
        this.artistas.add(nome);
    }

    public String listarArtistas() {
        StringBuilder listaArtistas = new StringBuilder();
        for (Artista artista : artistas) {
            listaArtistas.append(artista).append("\n");
        }
        return listaArtistas.toString();
    }

    public void addAlbum(Artista artista, String nomeAlbum) {
        artista.addAlbum(this.artista, nomeAlbum);
    }

    public void addSingle(Artista artista, String nomeSingle) {
        artista.addSingle(artista, nomeSingle);
    }






}
