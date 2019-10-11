package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.poderes.Poder;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia {

    public Elfo(String nombre, int edad, int salud) {
        super(nombre, edad, salud);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Poder getPoderInicial() {
        return null;
    }

    @Override
    public void aprender(Hechizo hechizo) {

    }

    @Override
    public List<Artefacto> getArtefactos() {
        return null;
    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {

    }

	@Override
	public void atacar(Personaje personaje, String nombreHechizo) {
		
	}

    
}