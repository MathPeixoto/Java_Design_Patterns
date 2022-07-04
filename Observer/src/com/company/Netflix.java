package com.company;

public class Netflix extends Streaming {
    private String filme;

    public void setFilme(String filme) {
        this.filme = filme;
        super.notificarAssinantes();
    }

    @Override
    public String getFilme() {
        return filme;
    }
}
