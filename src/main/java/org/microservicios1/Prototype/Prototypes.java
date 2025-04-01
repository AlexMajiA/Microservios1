package org.microservicios1.Prototype;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.microservicios1.models.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Prototypes {

    /*
    Explicación:
    - `stone` es el parámetro de entrada (objeto de tipo MindStone).
    - `stone.getPrototype()` clona el objeto llamando a su metodo getPrototype().
    - Como solo hay una instrucción, no es necesario usar `{}` ni `return`.
    */

    // Expresión lambda que clona una MindStone
    public static StonePrototype<MindStone> mindPrototype =
            stone ->  stone.getPrototype();

    // Expresión lambda que clona una PowerStone
    public static StonePrototype<PowerStone> powerPrototype =
            stone -> stone.getPrototype();

    // Expresión lambda que clona una RealityStone
    public static StonePrototype<RealityStone> realityPrototype =
            stone -> stone.getPrototype();

    // Expresión lambda que clona una SoulStone
    public static StonePrototype<SoulStone> soulPrototype =
            stone -> stone.getPrototype();

    // Expresión lambda que clona una SpaceStone
    public static StonePrototype<SpaceStone> spacePrototype =
            stone -> stone.getPrototype();

    // Expresión lambda que clona una TimeStone
    public static StonePrototype<TimeStone> timePrototype =
            stone -> stone.getPrototype();

}
