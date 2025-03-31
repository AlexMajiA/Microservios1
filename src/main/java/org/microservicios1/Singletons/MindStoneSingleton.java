package org.microservicios1.Singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.models.MindStone;

@Log
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class MindStoneSingleton {

    // Variable estática que almacena una única instancia de PowerStone
    private static volatile MindStone mindStoneInstance;

    //Metodo para acceder a la única instancia.
    public static MindStone getInstance(){


        if (mindStoneInstance == null){
            log.info("Creating first instance");

            // Me aseguro de que solo un hilo pueda acceder.
            synchronized (MindStoneSingleton.class){

                // Compruebo que no haya sido creada por otro hilo.
                if (mindStoneInstance == null){
                    mindStoneInstance = new MindStone();
                }
            }
        }
        // Retorno la única instancia creada.
        return mindStoneInstance;
    }

}
