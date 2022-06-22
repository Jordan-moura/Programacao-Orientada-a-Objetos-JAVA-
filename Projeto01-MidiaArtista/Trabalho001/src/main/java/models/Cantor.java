package models;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Cantor extends Artista{
    private int temp_carreira;

    public Cantor() {
    }

    public Cantor(int temp_carreira, String nome_artista) {
        super(nome_artista);
        this.temp_carreira = temp_carreira;
    }

    public int getTemp_carreira() {
        return temp_carreira;
    }

    public void setTemp_carreira(int temp_carreira) {
        this.temp_carreira = temp_carreira;
    }

    @Override
    public String toString() {
        return "tempo de carreira = " + temp_carreira ;
    }
    
}
