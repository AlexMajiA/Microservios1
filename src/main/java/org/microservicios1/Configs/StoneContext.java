package org.microservicios1.Configs;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.microservicios1.Factories.*;
import org.microservicios1.models.*;
import org.microservicios1.services.GuantletService;
import org.microservicios1.services.GuantletServiceImpl;

import java.util.Map;
import java.util.function.Consumer;

@Log
@NoArgsConstructor(access = AccessLevel.PRIVATE)

//inversion del control (IoC)
public class StoneContext {

    public static GuantletService setContext(
        Consumer<Void> preConstructor,
        Consumer<Void> postConstructor
    ){

        log.info("IoC set Scope");
        //Seteo una propiedad. (Puedo elegir entre singleton o prototype)
        System.setProperty("scope", "singleton");

        //@PreConstruct
        log.info("IoC executing PreConstruct");
        preConstructor.accept(null);


        // Inversión del control (IoC) Creación de factorías.
        log.info("IoC creating factories");
        var mindFactory = new MindStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var realityFactory = new RealityStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var spaceFactory = new SpaceStoneFactory();
        var timeFactory = new TimeStoneFactory();


        //Inyección de dependencias (DI) con constructor.
        log.info("IoC instance objects");
        MindStone mind = (MindStone) mindFactory.createStone();
        PowerStone power = (PowerStone) powerFactory.createStone();
        RealityStone reality = (RealityStone) realityFactory.createStone();
        SoulStone soul = (SoulStone) soulFactory.createStone();
        SpaceStone space = (SpaceStone) spaceFactory.createStone();
        TimeStone time = (TimeStone) timeFactory.createStone();

        //Inyección de dependencias (DI) via propiedad.
        log.info("IoC loading GuantletServiceImpl in container");
         final var guantletService = new GuantletServiceImpl();

        Map<String, Stone> instances = Map.of(
                "mind", mind,
                "power", power,
                "reality", reality,
                "soul", soul,
                "space", space,
                "time", time
        );

        //Inyección de dependencias (DI) via propiedad.
        log.info("IoC DI on GuantletServiceImpl");
        guantletService.setStones(instances);

        //PostConstruct
        log.info("IoC executing PostConstruct");
        postConstructor.accept(null);

        return guantletService;
    }

    public static void destroyContext(GuantletService guantletService){

        log.info("Cleaning context");
        if (guantletService instanceof GuantletServiceImpl){
            ((GuantletServiceImpl)guantletService).getMind().clear();
            ((GuantletServiceImpl)guantletService).getPower().clear();
            ((GuantletServiceImpl)guantletService).getReality().clear();
            ((GuantletServiceImpl)guantletService).getSoul().clear();
            ((GuantletServiceImpl)guantletService).getSpace().clear();
            ((GuantletServiceImpl)guantletService).getTime().clear();
        }

        log.info("Cleaning properties");
        System.clearProperty("scope");
    }

}
