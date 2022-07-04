package com.company;

public class AssinantePremium implements Observador{
    public AssinantePremium(Streaming streaming) {
        streaming.cadastrarAssinante(this);
    }

    @Override
    public void informarObservador(String filme) {
        System.out.println("Assinante premium, o filme " + filme +
                " acaba de ser adicionado ao nosso catalogo. Venha conferir!");
    }
}
