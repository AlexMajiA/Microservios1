package org.microservicios1.Factories;

import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.PowerStoneSingleton;
import org.microservicios1.models.PowerStone;
import org.microservicios1.models.Stone;

public class PowerStoneFactory extends ConfigurableStoneFactory{
    @Override
    public Stone createStone() {

        // Error handling
        if (super.isSingleton()){
            return PowerStoneSingleton.getInstance();
        }else {
            return Prototypes.powerPrototype.buildPrototype(new PowerStone());
        }
    }
}
