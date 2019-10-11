package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Amigue: clase que contiene las caracteristicas y funcionalidades 
 * de amigos.
 */
public class Amigue {

    public String nombre;
    public String fraseCabecera;
    private boolean estoyDisponible;
    /**
     * guita: esta protegida porque no quiero que nadie mas sepa cuanto tengo
     */
    protected double guita;
    /**
     * Mi nivel de emocion es privado.
     */
    private int emocion= 10;
    
/** En este caso el constructor tiene 2 parametros */
    public Amigue(String nombre, String frase){
        this.nombre = nombre;
        this.fraseCabecera = frase;
        
    }

    /**
     * Compra la cerveza
     * @param cantidad: cantidad de cervezas a comprar
     */
    public void comprarQuilmes(int cantidad) {

        Quilmes q = new Quilmes();

        //Si no me alcanza el dinero, me bajo de la juntada
        //y me deprimo
        if (this.guita <= (q.precio *  cantidad))
        {
            this.decir("Me quede sin un cobre. Me salgo");
            this.estoyDisponible = false;
            this.emocion --;
        }
        else
        {
            //Me alcanza el dinero
            //y me emociono
            this.guita -= (q.precio *  cantidad);
            this.decir("Lestooooo, quien compra las pizzas");
            this.emocion++;
        };

        //Si mi nivel de emocion es > 13 me descontrolo(?)
        if (this.emocion > 13)
        {
            this.decir("Aguante todoooooo");
        }
        
    }

    /**
     * Metodo que se usa para que el Amigue diga algo.
     * Esta protegido porque nadie dice algo por el
     * @param frase
     */
    protected void decir(String frase) {
        System.out.println(this.nombre + ":" + frase);
    }

    /**
     * Metodo publico para saber si se prende a la juntada o no
     * @return
     */
    public boolean sePrende()
    {
        return this.estoyDisponible;
    }

    /**
     * Metodo que sirve para preguntarle si algo de dinero.
     * Es publico ya que pregunta si tiene y no cuanto
     * 
     * @return
     */
    public boolean tieneGuita()
    {
        return this.guita > 0;
    }
    
    /**
     * Metodo estatico(de clase) que devuelve un conjunto especifico
     * de amigos con sus caracteristicas.
     * Para ser usado en pruebas de desarrollo
     * @return
     */
    public static List<Amigue> LesAmis(){
        
        List<Amigue> amigues;

        amigues = new ArrayList<Amigue>();

        
        Amigue am1 = new Amigue("Carla", "Esto se va a descontrolaar");

        am1.estoyDisponible = true;
        am1.guita = 10000;

        amigues.add(am1);

        Amigue am2 = new Amigue("Pedro", "Siempre Listo para Netflix");

        am2.estoyDisponible = false;
        am2.guita = 50;

        amigues.add(am2);


        Amigue am3 = new Amigue("Ana", "Te dijeeee");

        am3.estoyDisponible = true;
        am3.guita = 800;

        amigues.add(am3);

        return amigues;

    }
}