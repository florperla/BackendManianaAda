package app;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * Busco la lista de amigos completa. Esto lo maneja la clas Amigue con el
         * metodo de clase LesAmis
         */
        List<Amigue> amigues = Amigue.LesAmis();

        /**
         * Configuro cuantas juntadas
         */
        int cantJuntadas = 5;

        for (int i = 0; i < cantJuntadas; i++) {
            /**
             * Creo la juntada y la inicio con la lista de amigos.
             */
            Juntada partu = new Juntada("Tematica # " + i);
            partu.iniciar(amigues);
        }
    }
}