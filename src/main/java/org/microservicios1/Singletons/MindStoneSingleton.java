package org.microservicios1.Singletons;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.models.MindStone;

@Log
@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class MindStoneSingleton {

    private static volatile MindStone mindStoneInstance;

    //Metodo para acceder a la instancia.
    public static MindStone getInstance(){

        if (mindStoneInstance == null){
            log.info("Creating first instance");

            synchronized (MindStoneSingleton.class){

                if (mindStoneInstance == null){
                    mindStoneInstance = new MindStone();
                }
            }
        }
        return mindStoneInstance;
    }

}
