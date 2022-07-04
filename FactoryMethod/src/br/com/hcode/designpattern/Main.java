package br.com.hcode.designpattern;

import br.com.hcode.designpattern.factory.BikeFactoryTransport;
import br.com.hcode.designpattern.factory.CarFactoryTransport;
import br.com.hcode.designpattern.factory.MotorcycleFactoryTransport;
import br.com.hcode.designpattern.factory.FactoryTransport;

public class Main {
    private static FactoryTransport factoryTransport;

    public static void main(String[] args) {

        configure(args[0]);
        if(factoryTransport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        factoryTransport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber" -> factoryTransport = new CarFactoryTransport();
            case "log" -> factoryTransport = new MotorcycleFactoryTransport();
            case "eats" -> factoryTransport = new BikeFactoryTransport();
            default -> System.out.println("Selecione o tipo de entrega");
        }
    }
}
