package org.microservicios1.Factories;

import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.SoulStoneSingleton;
import org.microservicios1.models.SoulStone;
import org.microservicios1.models.Stone;

public class SoulFactory extends ConfigurableStoneFactory{


    @Override
    public Stone createStone() {

        if (super.isSingleton()){
            return SoulStoneSingleton.getInstance();
        }else{
          return Prototypes.soulPrototype.buildPrototype(new SoulStone());
        }
    }





}
