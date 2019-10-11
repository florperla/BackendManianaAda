package app.interfaces;

import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.personajes.Personaje;
import app.poderes.Poder;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    Poder getPoderInicial();

    void aprender(Hechizo hechizo);

    List<Artefacto> getArtefactos();
    
    void atacar(Personaje personaje, Hechizo hechizo);

    void atacar(Personaje personaje, String nombreHechizo );
}