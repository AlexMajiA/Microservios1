package org.microservicios1.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString (callSuper = true)
@Log
public class RealityStone extends Stone{

    //Constantes.
    private static final String COLOR = "Red";
    private static final String NAME = "Reality Stone";
    private static final String LOCATION = "Asgard";
    private static final int ENERGY_lEVEL = 6;

    public RealityStone() {
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Alter reality: " + super.toString());
    }

    public RealityStone getPrototype() {
        try (
                // Convert objetct into bytes
                final var baos = new ByteArrayOutputStream();
                final var oos = new ObjectOutputStream(baos);
        ) {

            // Seralize object and Clone.
            oos.writeObject(this);
            oos.flush();

            try (
                    // Deserialize
                    final var bais = new ByteArrayInputStream(baos.toByteArray());
                    final var ois = new ObjectInputStream(bais);
            ) {
                //Cast
                return (RealityStone) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class.");
            throw new RuntimeException(e.getMessage());

        }
    }

}
