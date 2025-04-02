package org.microservicios1.Factories;

import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.SpaceStoneSingleton;
import org.microservicios1.models.SpaceStone;
import org.microservicios1.models.Stone;

public class SpaceStoneFactory extends ConfigurableStoneFactory{

    @Override
    public Stone createStone() {

        // Verifica si la configuración indica que debe ser Singleton.
        if (super.isSingleton()){
            // Si es Singleton, devuelve la única instancia de SpaceStone.
            return SpaceStoneSingleton.getInstance();

        }else {
            // Si no es Singleton, crea una nueva instancia utilizando el Prototype.
            return Prototypes.spacePrototype.buildPrototype(new SpaceStone());
        }
    }
}
