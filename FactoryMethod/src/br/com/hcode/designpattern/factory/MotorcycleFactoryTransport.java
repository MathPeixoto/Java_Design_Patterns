package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.vehicles.IVehicle;
import br.com.hcode.designpattern.vehicles.Motorcycle;

public class MotorcycleFactoryTransport extends FactoryTransport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
