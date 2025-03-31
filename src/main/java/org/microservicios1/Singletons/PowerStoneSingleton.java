package org.microservicios1.Singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.models.PowerStone;

@Log
//Constructor sin parámetros.
@NoArgsConstructor (access = AccessLevel.PRIVATE)

public class PowerStoneSingleton {

    // Variable estática que almacena una única instancia de PowerStone
    private static PowerStone powerStoneInstance;

        //Metodo para acceder a la única instancia.
        public static PowerStone getInstance(){

            if (powerStoneInstance == null){
                log.info("Creating first instance: " + PowerStoneSingleton.class);

                // Me aseguro de que solo un hilo pueda acceder.
                synchronized (PowerStoneSingleton.class){

                    // Compruebo que no haya sido creada por otro hilo.
                    if (powerStoneInstance == null){
                        powerStoneInstance = new PowerStone();
                    }
                }
            }
            // Retorno la única instancia creada.
            return powerStoneInstance;
        }

}
