package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * CapaInvisibilidad
 */
public class CapaInvisibilidad extends Artefacto implements IReliquiaMuerte {

    public CapaInvisibilidad() {
        super(0,0.5d);
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }
    
}