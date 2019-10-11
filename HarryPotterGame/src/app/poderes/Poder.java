package app.poderes;

/**
 * Poder
 */
public class Poder {

    protected String nombre;

    public Poder(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}