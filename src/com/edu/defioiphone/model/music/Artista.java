package com.edu.defioiphone.model.music;

import java.util.ArrayList;
import java.util.List;

public class Artista {

    private String nomeDoArtista;
    private Album album;
    private Single single;

    public Artista(String nomeDoArtista) {
        this.nomeDoArtista = nomeDoArtista;
        List<Album> albuns = new ArrayList<>();
        List<Single> singles = new ArrayList<>();
    }

    public String getNomeDoArtista() {
        return nomeDoArtista;
    }

    public void setNomeDoArtista(String nomeDoArtista) {
        this.nomeDoArtista = nomeDoArtista;
    }


    @Override
    public String toString() {
        return "Nome do Artista: " + nomeDoArtista;
    }
}
