package relacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class RelacaoPalavras {

    public RelacaoPalavras() {
    }

    public void Alfabetico(String[] fraseSplit, String frase) {
        
        Arrays.sort(fraseSplit);

        System.out.println("\nORDEM ALFABETICA: ");
        for (String palavras : fraseSplit) {
            System.out.println(palavras);
        }
    }

    public void Ranking(String[] fraseSplit) {

        List<TopDez> listinha = new ArrayList<TopDez>();

        for (int i = 0; i < fraseSplit.length; i++) {
            TopDez aux = new TopDez();
            if (listinha.isEmpty()) {
                aux.setPalavra(fraseSplit[i]);
                aux.setCont(1);
                listinha.add(aux);
            } else {
                if (Existe(listinha, fraseSplit[i])) {
                    aux = Verifica(listinha, fraseSplit[i]);
                    aux.setCont(aux.getCont() + 1);
                } else {
                    aux.setPalavra(fraseSplit[i]);
                    aux.setCont(1);
                    listinha.add(aux);
                }
            }
        }

        Collections.sort(listinha);
        System.out.println("\n--------------------");
        System.out.println("TOP 10");
        System.out.println("--------------------");
        int x = 0;
        for (TopDez listando : listinha) {
            System.out.println("Palavra[" + (x + 1) + "]: " + listando.getPalavra() + "  ||  Ocorrencia: " + listando.getCont());

            x += 1;
            if (x == 10) {
                break;
            }
        }

    }
    
    
    
    
    
    public String[] Split(String frase) {

        String[] array = frase.split(" ");
        return array;
    }

    public boolean Existe(List<TopDez> listinha, String palavra) {

        for (TopDez nominho : listinha) {

            if (nominho.getPalavra().equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public TopDez Verifica(List<TopDez> listinha, String palavra) {

        for (TopDez nominho : listinha) {

            if (nominho.getPalavra().equalsIgnoreCase(palavra)) {
                return nominho;
            }
        }
        return null;
    }
    
    public String Replaces(String frase){
        
        frase = frase.replace(',', ' ');
        frase = frase.replace('!', ' ');
        frase = frase.replace('?', ' ');
        frase = frase.replace(';', ' ');
        frase = frase.replace(':', ' ');
        frase = frase.replace('"', ' ');
        frase = frase.replace('.', ' ');
        frase = frase.replace('(', ' ');
        frase = frase.replace(')', ' ');
       
        return frase;
    }
}
