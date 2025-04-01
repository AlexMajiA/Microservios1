package org.microservicios1.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString
@Log
public class PowerStone extends Stone {

    //Constantes.
    private static final String COLOR = "Purple";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Nova Corps";
    private static final int ENERGY_lEVEL = 10;

    public PowerStone() {
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override

    public void usePower() {

        //Business logic
        System.out.println("Incrase power and energy: " + super.toString());
    }


    public PowerStone getPrototype() {
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
                return (PowerStone) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class.");
            throw new RuntimeException(e.getMessage());

        }

    }
}