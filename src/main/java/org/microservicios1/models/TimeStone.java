package org.microservicios1.models;

import lombok.ToString;

@ToString
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
}
