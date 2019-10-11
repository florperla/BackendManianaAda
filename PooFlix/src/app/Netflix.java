package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Netflix {
    public static List<Peli> CatalogoPelis = new ArrayList<Peli>();
    public static List<Serie> CatalogoSeries = new ArrayList<Serie>();

    public static Serie BuscarSerie(String nombre) {
        for (Serie s : Netflix.CatalogoSeries) {
            if (s.nombre.equals(nombre))
                return s;
        }
        return null;
    }

    public static Peli BuscarPeli(String nombre) {
        for (Peli p : Netflix.CatalogoPelis) {
            if (p.nombre.equals(nombre))
                return p;
        }
        return null;
    }


    public static void LimpiarCatalogo()
    {
        Netflix.CatalogoPelis.clear();
        Netflix.CatalogoSeries.clear();
    }


    public static void InicializarCatalogo()
    {
            Netflix.AgregarBreakingBad();
    }


    public static void AgregarBreakingBad()
    {
            
            Serie breakingB = new Serie();
            breakingB.nombre = "Breaking Bad";
            breakingB.año = 2008;
            breakingB.genero = "Drama";
            
            Temporada t5 = new Temporada();
            t5.numeroTemporada = 5;
            
            Episodio ep = new Episodio();
            
            ep.nroEpisodio = 7;
            ep.titulo = "Say my name";
            ep.duracion = 43;
            
            t5.episodios.add(ep);

            Episodio epOtro = new Episodio();
            
            epOtro.nroEpisodio =5;
            epOtro.titulo = "Ozymandias";
            epOtro.duracion = 41;
            
            t5.episodios.add(epOtro);

            breakingB.temporadas.add(t5);


            Netflix.CatalogoSeries.add(breakingB);
    }



}
