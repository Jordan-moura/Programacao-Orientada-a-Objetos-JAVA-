package relacao;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class TopDez implements Comparable<TopDez> {

    private String palavra;
    private int cont;

    public TopDez() {
    }

    public TopDez(String palavra, int cont) {
        this.palavra = palavra;
        this.cont = cont;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "TopDez{" + "palavra=" + palavra + ", cont=" + cont + '}';
    }

    @Override
    public int compareTo(TopDez topdez) {
        if (this.cont > topdez.getCont()) {
            return -1;
        }
        if (this.cont < topdez.getCont()) {
            return 1;
        }
        return 0;
    }
}
