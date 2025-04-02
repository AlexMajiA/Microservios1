package org.microservicios1.Factories;

import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.TimeStoneSingleton;
import org.microservicios1.models.Stone;
import org.microservicios1.models.TimeStone;

public class TimeStoneFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {

        // Verifica si la configuración indica que debe ser Singleton.
        if (super.isSingleton()){
            // Si es Singleton, devuelve la única instancia de TimeStone.
            return TimeStoneSingleton.getInstance();

        } else {
            // Si no es Singleton, crea una nueva instancia utilizando el Prototype.
            return Prototypes.timePrototype.buildPrototype(new TimeStone());
        }

    }
}
