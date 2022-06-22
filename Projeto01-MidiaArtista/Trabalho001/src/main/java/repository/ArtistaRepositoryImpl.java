package repository;

import java.util.ArrayList;
import java.util.List;
import models.Artista;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class ArtistaRepositoryImpl implements ArtistaRepository {
    
     private static List<Artista> artistas = new ArrayList<>();
    
   @Override
    public boolean cadastrar(Artista artista) {
        return artistas.add(artista);
    }
}