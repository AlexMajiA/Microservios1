package org.microservicios1;

import org.microservicios1.Configs.StoneContext;
import org.microservicios1.Factories.*;
import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.MindStoneSingleton;
import org.microservicios1.models.*;
import org.microservicios1.services.GuantletService;
import org.microservicios1.services.GuantletServiceImpl;

import java.util.Map;

/**
 * ✅ Factorías (factories) → Deciden cómo y cuándo se crean objetos.
 * ✅ Prototipos (prototype) → Permiten clonar objetos en lugar de crearlos de cero.
 * ✅ Servicios (services) → Contienen lógica de negocio y usan las factorías.
 * ✅ Configuración (config) → Define Beans y el contexto de Spring.
 * ✅ Beans → Objetos gestionados por Spring (se crean e inyectan automáticamente).
 * ✅ Singleton → Asegura que solo haya una única instancia de un objeto.
 */

public class Main {
    public static void main(String[] args) {
/*
    final var mind = new MindStone();
    final var power = new PowerStone();
    final var reality = new RealityStone();
    final var soul = new SoulStone();
    final var time = new TimeStone();
    final var space = new  SpaceStone();

        System.out.println("------------------------------------------------------------");

        mind.usePower();

        System.out.println("------------------------------------------------------------");

        power.usePower();

        System.out.println("------------------------------------------------------------");

        reality.usePower();

        System.out.println("------------------------------------------------------------");

        soul.usePower();

        System.out.println("------------------------------------------------------------");

        time.usePower();

        System.out.println("------------------------------------------------------------");

        space.usePower();

        System.out.println("------------------------------------------------------------");

        //Instancio una variable de la interfaz.
        final var guantletService = new GuantletServiceImpl();

        //Llamo al metodo de la interfaz.
         guantletService.useGuantlet("");
*/
//----------------------------------------------------------------------------------------------------------------------
/*
        // Instancia 1
        final var mind = new MindStone();

        System.out.println(mind);
        System.out.println(System.identityHashCode(mind));

        //Esto genera un Clone, pero este tiene un hashCode diferente por lo que son objetos diferentes.
        //Instace 2
        final var mindPrototype = mind.getPrototype();
        System.out.println(mindPrototype);
        System.out.println(System.identityHashCode(mindPrototype));
*/
//----------------------------------------------------------------------------------------------------------------------
/*
        // Instancia 1
        final var mind = new MindStone();

        System.out.println(mind);
        System.out.println(System.identityHashCode(mind));

        //Esto genera un Clone, pero este tiene un hashCode diferente por lo que son objetos diferentes.
        //Instance 2
        final var mindPrototype = Prototypes.mindPrototype.buildPrototype(mind);
        System.out.println(mindPrototype);
        System.out.println(System.identityHashCode(mindPrototype));


        // Instance 3
        final var mindPrototype2 = Prototypes.mindPrototype.buildPrototype(mind);
        System.out.println(mindPrototype2);
        System.out.println(System.identityHashCode(mindPrototype2));
*/
//----------------------------------------------------------------------------------------------------------------------
/*
        //Seteo una propiedad. (Puedo elegir entre singleton o prototype)
        System.setProperty("scope", "prototype");

        //Creo una gema de la mente.
        final var mindStoneFactory = new MindStoneFactory();
        var mindStone = mindStoneFactory.createStone();

        //Creo una gema del poder.
        final var powerStoneFactory = new PowerStoneFactory();
        var powerStone = powerStoneFactory.createStone();

        //Creo una gema del realidad.
        final var realityStoneFactory = new RealityStoneFactory();
        var realityStone = realityStoneFactory.createStone();

        //Creo una gema del alma.
        final var soulStoneFactory = new SoulStoneFactory();
        var soulStone = soulStoneFactory.createStone();

        //Creo una gema del spacio.
        final var spaceStoneFactory = new SpaceStoneFactory();
        var spaceStone = spaceStoneFactory.createStone();

        //Creo una gema del tiempo.
        final var timeStoneFactory = new TimeStoneFactory();
        var timeStone = timeStoneFactory.createStone();

        System.out.println(mindStone);
        System.out.println(powerStone);
        System.out.println(realityStone);
        System.out.println(soulStone);
        System.out.println(spaceStone);
        System.out.println(timeStone);

*/
//----------------------------------------------------------------------------------------------------------------------
    /*
        //Seteo una propiedad. (Puedo elegir entre singleton o prototype)
        System.setProperty("scope", "singleton");

        //Creación de factorías.
        var mindFactory = new MindStoneFactory();
        var powerFactory = new PowerStoneFactory();
        var realityFactory = new RealityStoneFactory();
        var soulFactory = new SoulStoneFactory();
        var spaceFactory = new SpaceStoneFactory();
        var timeFactory = new TimeStoneFactory();

     */
    /*
        //Creación de instancias para la DI por dependencias.
        var mind = mindFactory.createStone();
        var power = powerFactory.createStone();
        var reality = realityFactory.createStone();
        var soul = soulFactory.createStone();
        var space = spaceFactory.createStone();
        var time = timeFactory.createStone();

     */
    /*
        //Creación de instancias para la DI por constructor (2).
        MindStone mind = (MindStone) mindFactory.createStone();
        PowerStone power = (PowerStone) powerFactory.createStone();
        RealityStone reality = (RealityStone) realityFactory.createStone();
        SoulStone soul = (SoulStone) soulFactory.createStone();
        SpaceStone space = (SpaceStone) spaceFactory.createStone();
        TimeStone time = (TimeStone) timeFactory.createStone();

        Map<String, Stone> instances = Map.of(
                "mind", mind,
                "power", power,
                "reality", reality,
                "soul", soul,
                "space", space,
                "time", time
        );

        //Inyección de dependencias (DI) via propiedad.
       // final var guantletService = new GuantletServiceImpl();

        //Inyección de dependencias (DI) via propiedad.
        //guantletService.setStones(instances);

        //DI por constructor (2)
        final var guantletService = new GuantletServiceImpl(mind, power, reality, soul, space, time);

     */

    /*
        //Inyección de dependencias (DI) con constructor.
        final var guantletService = new GuantletServiceImpl(
                realityFactory.createStone(),
                powerFactory.createStone(),
                mindFactory.createStone(),
                soulFactory.createStone(),
                spaceFactory.createStone(),
                timeFactory.createStone()
                 );

     */


    /*
        // Inyección de dependencias (DI) via setter.
        guantletService.setMind(mindFactory.createStone());
        guantletService.setPower(powerFactory.createStone());
        guantletService.setReality(realityFactory.createStone());
        guantletService.setSoul(soulFactory.createStone());
        guantletService.setSpace(spaceFactory.createStone());
        guantletService.setTime(timeFactory.createStone());
    */
    /*
        //
        guantletService.useGuantlet("mind");
        guantletService.useGuantlet("power");
        guantletService.useGuantlet("reality");
        guantletService.useGuantlet("soul");
        guantletService.useGuantlet("space");
        guantletService.useGuantlet("time");

        guantletService.useFullPower();

     */

//----------------------------------------------------------------------------------------------------------------------

final var guantletService = StoneContext.setContext(
    pre -> System.out.println("Do somenthing 1"),
    post -> System.out.println("Do somenthing 2")
);

        guantletService.useGuantlet("power");

        guantletService.useFullPower();

        // Llamo a mi contexto
        StoneContext.destroyContext(guantletService);

    }
}