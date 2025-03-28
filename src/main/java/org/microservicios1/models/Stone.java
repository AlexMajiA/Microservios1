package org.microservicios1.models;

public abstract class Stone {

    //Atributos
    String color;
    String name;
    String location;
    Integer energyLeven;
    Integer numberOfSides;

    //Constructor.
    public Stone(String color, String name, String location, Integer energyLeven, Integer numberOfSides) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLeven = energyLeven;
        this.numberOfSides = numberOfSides;
    }

    //Guetters y Setters.


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(Integer numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public Integer getEnergyLeven() {
        return energyLeven;
    }

    public void setEnergyLeven(Integer energyLeven) {
        this.energyLeven = energyLeven;
    }
}
