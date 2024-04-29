package com.edu.defioiphone.model.music;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nomeDoAlbum;
    private List<FaixaMusical> listaFaixaMusical;

    public Album(String nomeDoAlbum) {
        this.nomeDoAlbum = nomeDoAlbum;
        this.listaFaixaMusical = new ArrayList<>();
    }

    public void setNomeDoAlbum(String nomeDoAlbum) {
        this.nomeDoAlbum = nomeDoAlbum;
    }

    public String getNomeDoAlbum() {
        return nomeDoAlbum;
    }
}
