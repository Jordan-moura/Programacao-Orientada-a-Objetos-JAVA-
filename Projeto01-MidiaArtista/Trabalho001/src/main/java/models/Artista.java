
package models;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Artista {
    private String nome_artista;

    public Artista() {
    }

    public Artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }

    public String getNome_artista() {
        return nome_artista;
    }

    public void setNome_artista(String nome_artista) {
        this.nome_artista = nome_artista;
    }

    @Override
    public String toString() {
        return "Artista{" + "nome_artista=" + nome_artista + '}';
    }

  
    
    
}
