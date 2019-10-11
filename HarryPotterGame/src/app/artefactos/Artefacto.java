package app.artefactos;

import app.poderes.Poder;

/**
 * Artefacto
 */
public class Artefacto {

    protected Poder poder;
    protected double amplificadorDanio;
    protected double amplificadorSalud;

    public Artefacto(double amplificadorDanio, double amplificadorSalud) {
        super();
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public double getAmplificadorDanio() {
        return amplificadorDanio;
    }

    public void setAmplificadorDanio(double amplificadorDanio) {
        this.amplificadorDanio = amplificadorDanio;
    }

    public double getAmplificadorSalud() {
        return amplificadorSalud;
    }

    public void setAmplificadorSalud(double amplificadorSalud) {
        this.amplificadorSalud = amplificadorSalud;
    }
}