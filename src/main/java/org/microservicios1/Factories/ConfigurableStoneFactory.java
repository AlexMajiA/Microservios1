package org.microservicios1.Factories;

import lombok.extern.java.Log;
import org.microservicios1.models.Stone;

import java.util.Optional;

@Log
public abstract class ConfigurableStoneFactory {

    // Metodo abstracto que cada subclase debe implementar para crear una piedra (Stone)
    public abstract Stone createStone();

    // Metodo protegido que determina si se debe usar el patrón Singleton o no
    protected boolean isSingleton(){

        // Obtiene el valor de la propiedad del sistema "scope" (puede ser null)
        final var scopeOpt = Optional.of(System.getProperty("scope"));

        // Si la propiedad "scope" no está definida, se asume "singleton" por defecto
        final var scope = scopeOpt.orElse("singleton");

        // Imprime en el log el valor del scope para depuración
        log.info("scope: " + scope);

        // Devuelve true si "scope" es "singleton", false en caso contrario
        return "singleton".equals(scope) ? true: false;
    }
}
