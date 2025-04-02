package org.microservicios1.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;

@ToString (callSuper = true)
@Log
public class SoulStone extends Stone{

    //Constantes.
    private static final String COLOR = "Orange";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Vormir";
    private static final int ENERGY_lEVEL = 3;

    public SoulStone() {
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Total control of person: " + super.toString());
    }

    public SoulStone getPrototype() {
        try (
                // Convert object into bytes
                final var baos = new ByteArrayOutputStream();
                final var oos = new ObjectOutputStream(baos);
        ) {

            // Serialize object and Clone.
            oos.writeObject(this);
            oos.flush();

            try (
                    // Deserialize
                    final var bais = new ByteArrayInputStream(baos.toByteArray());
                    final var ois = new ObjectInputStream(bais);
            ) {
                //Cast
                return (SoulStone) ois.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            log.warning("Cant cast or read class.");
            throw new RuntimeException(e.getMessage());

        }
    }
}
