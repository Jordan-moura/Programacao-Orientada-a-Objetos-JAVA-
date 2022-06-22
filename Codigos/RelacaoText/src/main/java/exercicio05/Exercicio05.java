package exercicio05;

import java.util.Scanner;
import relacao.RelacaoPalavras;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Cabecalho();
        Saidas(Entradas());
    }

    public static void Cabecalho(){

        System.out.println("Exercicio 05: ");
        System.out.println("----------------------------------\n");
    }

    public static String Entradas() {

        System.out.println("Digite uma frase: ");
        String frase;
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        
        return frase;
    }

    public static void Saidas(String frase) {

        RelacaoPalavras saida = new RelacaoPalavras();
            
        frase = saida.Replaces(frase);
        String[] splitzera = saida.Split(frase);
        saida.Alfabetico(splitzera, frase);
        saida.Ranking(splitzera);
    }
}
