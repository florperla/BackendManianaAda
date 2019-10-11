package app.transportes;

import app.interfaces.IEsMagico;

/**
 * ExpressoHowards
 */
public class ExpressoHowards extends Transporte implements IEsMagico{

    @Override
    public boolean esInvisibleAMuggles() {
        return true;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    
}