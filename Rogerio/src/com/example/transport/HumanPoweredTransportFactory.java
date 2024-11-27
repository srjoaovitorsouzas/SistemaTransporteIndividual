package com.example.transport;

public class HumanPoweredTransportFactory implements TransportFactory {
    @Override
    public Transport createScooter() {
        throw new UnsupportedOperationException("Patinetes não disponíveis na categoria transporte humano.");
    }

    @Override
    public Transport createBike() {
        return new Bicycle();
    }

    @Override
    public Transport createSkates() {
        return new RollerSkates();
    }

    @Override
    public Transport createSkateboard() {
        return new Skateboard();
    }
}
