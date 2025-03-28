package org.microservicios1.models;

import lombok.ToString;

@ToString
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
}
