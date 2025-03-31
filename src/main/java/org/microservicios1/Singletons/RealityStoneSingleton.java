package org.microservicios1.Singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.models.RealityStone;

@Log
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class RealityStoneSingleton {

    // Variable estática que almacena una única instancia de PowerStone
    private static volatile RealityStone realityStoneInstance;

    //Metodo para acceder a la única instancia.
    public static RealityStone getInstance(){

        if (realityStoneInstance == null){
            log.info("Creating first Instance.");

            // Me aseguro de que solo un hilo pueda acceder.
            synchronized (RealityStoneSingleton.class){

                // Compruebo que no haya sido creada por otro hilo.
                if (realityStoneInstance == null){
                    realityStoneInstance = new RealityStone();

                }
            }
        }
        // Retorno la única instancia creada.
        return realityStoneInstance;
    }

}
