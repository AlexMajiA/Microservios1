package org.microservicios1.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class Stone {

    //Atributos
    protected String color;
    protected String name;
    protected String location;
    protected Integer energyLevel;
    protected Integer numberOfSides;

    //Añado una constante puesto que todas las gemas tienen 6 lados.
    public static final int NUMBER_SIDES =6;

    //Constructor.
    public Stone(String color, String name, String location, Integer energyLevel) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLevel = energyLevel;
        this.numberOfSides = NUMBER_SIDES;
    }


    public abstract void usePower();

}
