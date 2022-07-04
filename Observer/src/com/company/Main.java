package com.company;

public class Main {

    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        Observador assinanteBasico = new AssinanteBasico(netflix);
        Observador assinantePremium = new AssinantePremium(netflix);

        netflix.setFilme("Paternidade");
    }
}
