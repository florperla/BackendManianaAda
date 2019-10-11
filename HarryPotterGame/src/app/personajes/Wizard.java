package app.personajes;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;
import app.transportes.Escoba;

public class Wizard extends Persona implements IHacerMagia {

    protected Escoba escoba;

    protected List<Hechizo> hechizos = new ArrayList<Hechizo>();

    protected Poder poderInicial;

    protected List<Artefacto> artefactos = new ArrayList<>();

    protected boolean magoOscuro;

    protected int energiaMagica = 100;

    public Wizard(String nombre, int edad, int salud) {
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
    public void atacar(Personaje personaje, String nombreHechizo) {
        // Busco el hechizo y lo aplico
    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {

        double nivelDanioTotal = 0;
        double nivelCuracionTotal = 0;

        nivelDanioTotal = hechizo.getNivelDanio();

        for (Artefacto artefacto : artefactos) {

            if (artefacto.getAmplificadorDanio() > 0)
                nivelDanioTotal *= artefacto.getAmplificadorDanio();
        }

        if (this.tieneReliquiaDeLaMuerte())
            nivelDanioTotal *= 2;

        nivelCuracionTotal = hechizo.getNivelCuracion();

        for (Artefacto artefacto : ((Wizard) personaje).getArtefactos()) {

            if (artefacto.getAmplificadorSalud() > 0)
                nivelCuracionTotal *= artefacto.getAmplificadorSalud();
        }

        if (this.tieneReliquiaDeLaMuerte())
            nivelCuracionTotal *= 2;

        if (hechizo.isEsOscuro())
            this.setMagoOscuro(true);
        
        personaje.setSalud(personaje.getSalud() + (int)(nivelCuracionTotal - nivelDanioTotal));

    }

    public boolean tieneReliquiaDeLaMuerte() {

        for (Artefacto artefacto : artefactos) {

            if (artefacto instanceof IReliquiaMuerte)
                return true;

        }

        return false;

    }

    public Escoba getEscoba() {
        return escoba;
    }

    public void setEscoba(Escoba escoba) {
        this.escoba = escoba;
    }

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }

    public boolean isMagoOscuro() {
        return magoOscuro;
    }

    public void setMagoOscuro(boolean magoOscuro) {
        this.magoOscuro = magoOscuro;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

}