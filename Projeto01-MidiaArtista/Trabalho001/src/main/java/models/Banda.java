package models;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Banda extends Artista{
    
    public int num_membros;

    public Banda() {
    }

    public Banda(int num_membros, String nome_artista) {
        super(nome_artista);
        this.num_membros = num_membros;
    }

    public int getNum_membros() {
        return num_membros;
    }

    public void setNum_membros(int num_membros) {
        this.num_membros = num_membros;
    }

    @Override
    public String toString() {
        return  "numero de membros da banda = " + getNum_membros();
                //"Banda{" + super.toString() + "num_membros=" + num_membros + '}';
    }
    
}
