package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.vehicles.Car;
import br.com.hcode.designpattern.vehicles.IVehicle;

public class CarFactoryTransport extends FactoryTransport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
