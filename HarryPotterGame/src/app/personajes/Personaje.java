package app.personajes;

/**
 * Personaje
 */
public class Personaje {

    protected String nombre;
    protected int edad;
    protected int salud = 100;

    public Personaje(String nombre, int edad, int salud) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    //Checkeo si esta vivo por la salud
    public boolean estaVivo()
    {
        return salud > 0;
    }
    
}