package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * PiedraResurreccion
 */
public class PiedraResurreccion extends Artefacto  implements IReliquiaMuerte{

    public PiedraResurreccion() {
        super(0, 10);
    }

    @Override
    public boolean esReliquiaMuerte() {
        return false;
    }
    
}