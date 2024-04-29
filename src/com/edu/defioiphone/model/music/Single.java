package com.edu.defioiphone.model.music;

import java.util.ArrayList;
import java.util.List;

public class Single {

    private String nomeDoSingle;
    List<FaixaMusical> listaFaixaMusical;

    public Single(String nomeDoSingle) {
        this.nomeDoSingle = nomeDoSingle;
        listaFaixaMusical = new ArrayList<>();
    }

    public String getNomeDoSingle() {
        return nomeDoSingle;
    }

    public void setNomeDoSingle(String nomeDoSingle) {
        this.nomeDoSingle = nomeDoSingle;
    }





}
