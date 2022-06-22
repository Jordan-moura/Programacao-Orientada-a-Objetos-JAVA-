/*
 * @author Beatriz de Oliveira Cavalheri (RA: 221150099)
 * @author Gabriella Alves de Oliveira (RA: 211150959)
 * @author Jordan Rodrigues Moura (RA: 201151031)
 */

package atividade1;
import java.util.*;

public class Atividade1 {

    public static void main(String[] args) {
        
        /**
         * 
         * - A variável "players" diz respeito a quantidade de jogadores;
         * - O array "pontuacao" armazena a pontuacao de cada jogador;
         * - A variável "aux" diz respeito a uma variável auxiliar para comparar
         *   a pontuação dos jogadores;
         * - A variável "temp_players" diz respeito a uma variável auxiliar que
         *   armazena qual jogador ganhou caso nenhum dos jogadores tenha ganhado
         *   mas possui alta pontuação;
         */
        
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de advinhacoes!\n");
        System.out.println("Insira o numero de jogadores:");

        int players;
        players = input.nextInt();

        int[] pontuacao = new int[players];
        Aleatorio n = new Aleatorio(players);
        int aux = 0, temp_player = 0;

        for (int i = 0; i < players; i++) {
            
            System.out.println("Jogador " + (i + 1) + ", sua vez!\n");
            
            do {
                
                System.out.println("Digite um numero entre 0 e 10: ");
                n.numero = input.nextInt();
                n.verificador(i);

                if (n.teste == false) {
                    n.seErro();
                } else {
                    pontuacao = n.seAcerto(i, players);
                }
                
            } while (n.teste == false);
            
            if (aux < pontuacao[i]) {
                aux = pontuacao[i];
                temp_player = i;
            }
            
        }  
        System.out.println("Fim de jogo! O jogador " + (temp_player + 1) + " ganhou!");
    }
    
}
