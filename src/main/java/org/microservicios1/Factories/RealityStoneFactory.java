package org.microservicios1.Factories;

import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.RealityStoneSingleton;
import org.microservicios1.models.RealityStone;
import org.microservicios1.models.Stone;

public class RealityStoneFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {

        // Verifica si la configuración indica que debe ser Singleton.
        if (super.isSingleton()){
            // Si es Singleton, devuelve la única instancia de RealityStone.
            return RealityStoneSingleton.getInstance();

        } else {
            // Si no es Singleton, crea una nueva instancia utilizando el Prototype.
            return Prototypes.realityPrototype.buildPrototype(new RealityStone());
        }
    }
}
