package org.microservicios1.Singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.models.TimeStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class TimeStoneSingleton {

    // Variable estática que almacena una única instancia de PowerStone
    private static volatile TimeStone timeStoneInstance;

    //Metodo para acceder a la única instancia.
    public static TimeStone getInstance(){

        if (timeStoneInstance == null){
            log.info("Creating first instance.");

            // Me aseguro de que solo un hilo pueda acceder.
            synchronized (timeStoneInstance){

                // Compruebo que no haya sido creada por otro hilo.
                if (timeStoneInstance == null){
                    timeStoneInstance = new TimeStone();
                }
            }
        }
        // Retorno la única instancia creada.
        return timeStoneInstance;
    }


}
