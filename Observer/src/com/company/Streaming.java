package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Streaming {
    private final List<Observador> assinantes = new ArrayList<>();

    public void cadastrarAssinante(Observador assinante) {
        this.assinantes.add(assinante);
    }

    public void notificarAssinantes() {
        for (Observador assinante : this.assinantes) {
            assinante.informarObservador(getFilme());
        }
    }

    public abstract String getFilme();
}
