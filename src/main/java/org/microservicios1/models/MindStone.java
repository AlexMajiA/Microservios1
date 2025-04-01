package org.microservicios1.models;

import lombok.ToString;
import lombok.extern.java.Log;

import java.io.*;
//Llama al constructor del padre, como este tiene ToString, implementa sus hijos.
@ToString (callSuper = true)
@Log
public class MindStone extends Stone{

    //Constantes.
    private static final String COLOR = "Yelow";
    private static final String NAME = "Power Stone";
    private static final String LOCATION = "Mr Vision";
    private static final int ENERGY_lEVEL = 4;

    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_lEVEL);
    }

    @Override
    public void usePower() {
        //Business logic
        System.out.println("Mind control in stone: " + super.toString());

    }

    public MindStone getPrototype(){
        try(
            // Convert objetct into bytes
            final var baos = new ByteArrayOutputStream();
            final var oos = new ObjectOutputStream(baos);
            ) {

            // Seralize object and Clone.
            oos.writeObject(this);
            oos.flush();

            try(
                // Deserialize
                final var bais = new ByteArrayInputStream(baos.toByteArray());
                final var ois = new ObjectInputStream(bais);
                ){
                //Cast
                return (MindStone) ois.readObject();
            }

        } catch (IOException |ClassNotFoundException e){
            log.warning("Cant cast or read class.");
            throw new RuntimeException(e.getMessage());

        }

    }
}