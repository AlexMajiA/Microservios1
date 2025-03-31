package org.microservicios1.Singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.models.SpaceStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class SpaceStoneSingleton {

    // Variable estática que almacena una única instancia de PowerStone
    private static volatile SpaceStone spaceStoneInstance;

    //Metodo para acceder a la única instancia.
    public static SpaceStone getInstance(){

        if (spaceStoneInstance == null){
            log.info("Creating first instance.");

            // Me aseguro de que solo un hilo pueda acceder.
            synchronized (spaceStoneInstance){

                // Compruebo que no haya sido creada por otro hilo.
                if (spaceStoneInstance == null){

                    spaceStoneInstance = new SpaceStone();
                }
            }
        }
        // Retorno la única instancia creada.
        return spaceStoneInstance;
    }

}
