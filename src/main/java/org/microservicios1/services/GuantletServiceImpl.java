package org.microservicios1.services;

import lombok.extern.java.Log;
import org.microservicios1.Singletons.MindStoneSingleton;
import org.microservicios1.models.RealityStone;
import org.microservicios1.models.Stone;

//@Service
@Log
public class GuantletServiceImpl implements GuantletService {

    private final Stone reality = MindStoneSingleton.getInstance();


    @Override
    public void useGuantlet(String stoneName) {
        log.info("Use stone: " + reality);
    }
}
