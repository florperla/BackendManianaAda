package app.hechizos;

import app.poderes.Poder;

/**
 * Hechizo
 */
public class Hechizo extends Poder {

    protected boolean esOscuro;
    protected double nivelDanio;
    protected double nivelCuracion;
    protected int nivelEnergia;

    public Hechizo(String nombre) {
        super(nombre);
        // TODO Auto-generated constructor stub
    }

    public Hechizo(String nombre, double nivelDanio, double nivelCuracion, int nivelEnergia) {
        super(nombre);
        this.nivelDanio = nivelDanio;
        this.nivelCuracion = nivelCuracion;
        this.nivelEnergia = nivelEnergia;

    }

    public boolean isEsOscuro() {
        return esOscuro;
    }

    public void setEsOscuro(boolean esOscuro) {
        this.esOscuro = esOscuro;
    }

    public double getNivelDanio() {
        return nivelDanio;
    }

    public void setNivelDanio(double nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public double getNivelCuracion() {
        return nivelCuracion;
    }

    public void setNivelCuracion(double nivelCuracion) {
        this.nivelCuracion = nivelCuracion;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

}