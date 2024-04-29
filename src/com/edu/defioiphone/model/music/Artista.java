package com.edu.defioiphone.model.music;

import java.util.ArrayList;
import java.util.List;

public class Artista {

    private String nomeDoArtista;
    private Album album;
    private Single single;

    List<Album> albuns;
    List<Single> singles;

    public Artista(String nomeDoArtista) {
        this.nomeDoArtista = nomeDoArtista;
        albuns = new ArrayList<>();
        singles = new ArrayList<>();
    }

    public String getNomeDoArtista() {
        return nomeDoArtista;
    }

    public void setNomeDoArtista(String nomeDoArtista) {
        this.nomeDoArtista = nomeDoArtista;
    }


    public void addAlbum(Artista artista, String nomeAlbum) {
        this.albuns.add(new Album(nomeAlbum));
    }

    public void addSingle(Artista artista, String nomeSingle) {
        this.singles.add(new Single(nomeSingle));
    }


    @Override
    public String toString() {
        return "Nome do Artista: " + nomeDoArtista;
    }



}
