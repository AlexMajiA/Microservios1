package org.microservicios1.services;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;
import org.microservicios1.Singletons.MindStoneSingleton;
import org.microservicios1.models.RealityStone;
import org.microservicios1.models.Stone;

//@Service
@Log
//@Setter
@AllArgsConstructor
public class GuantletServiceImpl implements GuantletService {

    // NO es una inyección de dependencias.
    //private final Stone reality = MindStoneSingleton.getInstance();
    private final Stone reality;
    private final Stone power;
    private final Stone mind;
    private final Stone soul;
    private final Stone space;
    private final Stone time;



    @Override
    public void useGuantlet(String stoneName) {
        //log.info("Use stone: " + reality);

        switch (stoneName){
            case "mind" -> log.info("Use stone: " + this.mind);
            case "power" -> log.info("Use stone: " + this.power);
            case "reality" -> log.info("Use stone: " + this.reality);
            case "soul" -> log.info("Use stone: " + this.soul);
            case "space" -> log.info("Use stone: " + this.space);
            case "time" -> log.info("Use stone: " + this.time);


            default -> throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public void useFullPower() {

        if (this.mind != null && this.power != null && this.reality != null
                && this.soul != null && this.space !=null && this.time != null){
            log.info("USING ALL POWER");
        }else {
            throw  new IllegalStateException("Cant be using full power because service have field null");
        }
    }
/*
    //Inyección de dependencias. (También podría hacerlo con @Setter de Lombok)
    public void setReality(Stone reality) {
        this.reality = reality;
    }

 */
}
