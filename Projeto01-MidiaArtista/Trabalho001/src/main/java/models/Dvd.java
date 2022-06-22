package models;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Dvd extends Midia {
    private String temp_duracao;

    public Dvd() {
    }

    public Dvd(String temp_duracao, String nome_midia, String codigo, double preco, Artista artista) {
        super(nome_midia, codigo, preco, artista);
        this.temp_duracao = temp_duracao;
    }

    public String getTemp_duracao() {
        return temp_duracao;
    }

    public void setTemp_duracao(String temp_duracao) {
        this.temp_duracao = temp_duracao;
    }

    @Override
    public String toString() {
        return "Dvd\n" + super.toString() + "\ntempo de duracao = " + temp_duracao;
    }
    
    
}
