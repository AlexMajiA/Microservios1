package org.microservicios1;

import org.microservicios1.Singletons.MindStoneSingleton;
import org.microservicios1.models.*;
import org.microservicios1.services.GuantletServiceImpl;

public class Main {
    public static void main(String[] args) {

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


    }
}