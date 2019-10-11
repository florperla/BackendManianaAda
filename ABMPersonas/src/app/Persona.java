package app;

import java.util.List;

public class Persona {

    private String dni;
    private String nombre;
    private int edad;

    Persona(){

    }
    Persona(String nombre, String dni, int edad){
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public static Persona BuscarPersona(String nombre, List<Persona> personas){
        for (Persona p : personas) {
            if (p.getNombre().equals(nombre)) {
                return p;

            }
        }

        return null;

    }
}
