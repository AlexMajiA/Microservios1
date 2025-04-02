package org.microservicios1.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString (callSuper = true)
@Log
public class TimeStone extends Stone{

    //Constantes.
    private static final String COLOR = "Green";
    private static final String NAME = "Time Stone";
    private static final String LOCATION = "Agamotto";
    private static final int ENERGY_lEVEL = 9;

    public TimeStone() {
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override
    public void usePower() {

        //Business logic
        System.out.println("Control time: " + super.toString());
    }

    public TimeStone getPrototype() {
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
                return (TimeStone) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class.");
            throw new RuntimeException(e.getMessage());

        }
    }
}
