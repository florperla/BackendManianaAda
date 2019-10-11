package app.artefactos;

import app.interfaces.IReliquiaMuerte;

/**
 * VaritaSauco
 */
public class VaritaSauco extends Varita implements IReliquiaMuerte {

    public VaritaSauco() {
        super(2, 2);
    }

    @Override
    public boolean esReliquiaMuerte() {
        return true;
    }
}