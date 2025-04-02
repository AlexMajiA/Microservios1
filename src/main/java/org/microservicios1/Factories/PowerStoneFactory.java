package org.microservicios1.Factories;

import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.PowerStoneSingleton;
import org.microservicios1.models.PowerStone;
import org.microservicios1.models.Stone;

public class PowerStoneFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {

        // Error handling
        // Verifica si la configuración indica que debe ser Singleton.
        if (super.isSingleton()){
            // Si es Singleton, devuelve la única instancia de PowerStone.
            return PowerStoneSingleton.getInstance();
        }else {
            // Si no es Singleton, crea una nueva instancia utilizando el Prototype.
            return Prototypes.powerPrototype.buildPrototype(new PowerStone());
        }
    }
}
