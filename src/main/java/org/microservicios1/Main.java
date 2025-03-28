package org.microservicios1;

import org.microservicios1.models.*;

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
    }
}