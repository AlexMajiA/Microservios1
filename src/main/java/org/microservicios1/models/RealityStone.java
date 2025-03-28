package org.microservicios1.models;

import lombok.ToString;

@ToString
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
}
