package com.example.transport;

public class Main {
    public static void main(String[] args) {
        // Transportes movidos a bateria
        TransportFactory electricFactory = new ElectricTransportFactory();
        Transport electricScooter = electricFactory.createScooter();
        Transport electricBike = electricFactory.createBike();
        electricScooter.ride();
        electricBike.ride();

        // Transportes movidos pela força do ser humano
        TransportFactory humanFactory = new HumanPoweredTransportFactory();
        Transport bicycle = humanFactory.createBike();
        Transport rollerSkates = humanFactory.createSkates();
        Transport skateboard = humanFactory.createSkateboard();
        bicycle.ride();
        rollerSkates.ride();
        skateboard.ride();
    }
}
