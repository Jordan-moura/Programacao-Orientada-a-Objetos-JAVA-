package models;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Cd extends Midia {
    private int num_faixas;

    public Cd() {
    }

    public Cd(int num_faixas, String nome_midia, String codigo, double preco, Artista artista) {
        super(nome_midia, codigo, preco, artista);
        this.num_faixas = num_faixas;
    }

    public int getNum_faixas() {
        return num_faixas;
    }

    public void setNum_faixas(int num_faixas) {
        this.num_faixas = num_faixas;
    }

    @Override
    public String toString() {
            
        return "Cd\n" + super.toString() + "\nnumero de faixas = " + num_faixas;
    }
    
    
    
}
