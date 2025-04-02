package org.microservicios1.Factories;

import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.MindStoneSingleton;
import org.microservicios1.models.MindStone;
import org.microservicios1.models.Stone;

public class MindStoneFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {
        // Verifica si la configuración indica que debe ser Singleton.
        if (super.isSingleton()){
            // Si es Singleton, devuelve la única instancia de MindStone.
            return MindStoneSingleton.getInstance();
        }else {
            // Si no es Singleton, crea una nueva instancia utilizando el Prototype.
            return Prototypes.mindPrototype.buildPrototype(new MindStone());
        }
    }
}
