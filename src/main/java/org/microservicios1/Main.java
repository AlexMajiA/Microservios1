package org.microservicios1;

import org.microservicios1.Factories.*;
import org.microservicios1.Prototype.Prototypes;
import org.microservicios1.Singletons.MindStoneSingleton;
import org.microservicios1.models.*;
import org.microservicios1.services.GuantletServiceImpl;

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


    }
}