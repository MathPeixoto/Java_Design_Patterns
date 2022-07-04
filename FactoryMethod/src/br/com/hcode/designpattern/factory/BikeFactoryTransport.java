package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.vehicles.Bike;
import br.com.hcode.designpattern.vehicles.IVehicle;

public class BikeFactoryTransport extends FactoryTransport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
