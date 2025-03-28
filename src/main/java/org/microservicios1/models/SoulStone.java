package org.microservicios1.models;

import lombok.ToString;

@ToString
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
}
