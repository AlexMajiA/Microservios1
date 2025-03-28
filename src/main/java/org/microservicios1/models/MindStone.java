package org.microservicios1.models;

import lombok.ToString;

@ToString
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
}