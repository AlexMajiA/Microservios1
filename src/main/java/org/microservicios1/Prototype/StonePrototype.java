package org.microservicios1.Prototype;

import org.microservicios1.models.Stone;

@FunctionalInterface
public interface StonePrototype<S extends Stone> {

    S buildPrototype();

}
