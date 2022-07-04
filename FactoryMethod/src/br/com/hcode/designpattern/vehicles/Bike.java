package br.com.hcode.designpattern.vehicles;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        this.getCargo();
        System.out.println("Iniciando trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("carga em mãos");
    }
}
