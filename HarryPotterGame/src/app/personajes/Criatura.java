package app.personajes;

import app.interfaces.IEsMagico;

/**
 * Criatura
 */
public class Criatura extends Personaje implements IEsMagico{

    public Criatura(String nombre, int edad, int salud) {
        super(nombre, edad, salud);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }

    
}