package com.company;

public class AssinanteBasico implements Observador{
    public AssinanteBasico(Streaming streaming) {
        streaming.cadastrarAssinante(this);
    }

    @Override
    public void informarObservador(String filme) {
        System.out.println("Assinante basico, o filme " + filme +
                " acaba de ser adicionado ao nosso catalogo. Venha conferir!");
    }
}
