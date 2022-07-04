package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.vehicles.IVehicle;

public abstract class FactoryTransport {

    public void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
