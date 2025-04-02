package org.microservicios1.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString (callSuper = true)
@Log
public class SpaceStone extends Stone {

    //Variables constantes.
    private static final String COLOR = "Blue";
    private static final String NAME = "SpaceStone";
    private static final String LOCATION = "Tesseract";
    private static final int ENERGY_lEVEL = 7;


    public SpaceStone() {

        //SUPER = Se refiere al constructor del padre.
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Manipulate all space: " + super.toString());
    }

    public SpaceStone getPrototype() {
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
                return (SpaceStone) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class.");
            throw new RuntimeException(e.getMessage());

        }
    }
}
