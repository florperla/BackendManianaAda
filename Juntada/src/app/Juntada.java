package app;

import java.util.List;

/**
 * Juntada
 */
public class Juntada {

    public String tematica;

    public Juntada(String tematica) {
        super();
        this.tematica = tematica;

    }

    public void iniciar(List<Amigue> estosInvitados) {

        System.out.println("A juntarsee");
        System.out.println("Juntada " + tematica);
        for (Amigue amigue : estosInvitados) {
            if (amigue.sePrende()) {
                System.out.println(amigue.nombre + " Se prende");
                amigue.comprarQuilmes(10);
            } else {
                System.out.println(amigue.nombre + " no se prende. Tiene guita: " + amigue.tieneGuita());
            }
        }
    }

}