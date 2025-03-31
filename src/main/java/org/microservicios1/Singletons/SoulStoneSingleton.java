package org.microservicios1.Singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.models.SoulStone;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class SoulStoneSingleton {

    // Variable estática que almacena una única instancia de PowerStone
    private static volatile SoulStone soulStoneInstance;

    //Metodo para acceder a la única instancia.
    public static SoulStone getInstance(){

        if (soulStoneInstance == null){
            log.info("Creating first instance.");

            // Me aseguro de que solo un hilo pueda acceder.
            synchronized (soulStoneInstance){

                // Compruebo que no haya sido creada por otro hilo.
                if (soulStoneInstance == null){
                    soulStoneInstance = new SoulStone();
                }
            }

        }
    // Retorno la única instancia creada.
    return soulStoneInstance;
    }






}
