package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * Horrocrux
 */
public class Horrocrux extends Artefacto implements IReliquiaMuerte{

    public Horrocrux() {
        super(10,0);
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }
}