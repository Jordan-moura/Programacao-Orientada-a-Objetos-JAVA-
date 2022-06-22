package models;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Midia {
    private String nome_midia;
    private String codigo;
    private double preco;
    private Artista artista;

    public Midia() {
    }

    public Midia(String nome_midia, String codigo, double preco, Artista artista) {
        this.nome_midia = nome_midia;
        this.codigo = codigo;
        this.preco = preco;
        this.artista = artista;
    }

    public String getNome_midia() {
        return nome_midia;
    }

    public void setNome_midia(String nome_midia) {
        this.nome_midia = nome_midia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Nome da midia = " + getNome_midia() +
                "\nCodigo de Barras = " + getCodigo() +
                "\nPreco = " + getPreco() +
                "\nNome Artistico = " + artista.getNome_artista() +
                "\n" + artista;
//"Midia{" + "nome_midia=" + nome_midia + ", codigo=" + codigo + ", preco=" + preco + ", artista=" + artista + '}';
    }
    
}
