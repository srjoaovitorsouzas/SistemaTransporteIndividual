package com.example.transport;

public interface TransportFactory {
    Transport createScooter();
    Transport createBike();
    Transport createSkates();
    Transport createSkateboard();
}
