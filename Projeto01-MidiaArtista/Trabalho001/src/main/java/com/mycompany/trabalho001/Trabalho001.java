package com.mycompany.trabalho001;

import repository.ArtistaRepository;
import repository.ArtistaRepositoryImpl;
import repository.MidiaRepository;
import repository.MidiaRepositoryImpl;
import java.util.*;
import java.lang.*;
import models.Artista;
import models.Banda;
import models.Cantor;
import models.Cd;
import models.Dvd;
import models.Midia;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class Trabalho001 {

    private static Scanner sc = new Scanner(System.in);
    private static MidiaRepository midiaDAO = new MidiaRepositoryImpl();
    private static ArtistaRepository artistaDAO = new ArtistaRepositoryImpl();

    public static void main(String[] args) {
        cabecalho();
        menu();

    }

    private static void cabecalho() {
        System.out.println("");
        System.out.println("Sistema de Gerenciamento de Midia");
        
    }

    private static void menu() {

        int opcao;
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("1 - Cadastrar Midia");
        System.out.println("2 - Listar");
        System.out.println("3 - Vender Midia"); //excluir
        System.out.println("4 - Pesquisar posicao da Midia");
        System.out.println("5 - Sair");
        System.out.println("-----------------------------------");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1: {
                cadastrarArtista();
                break;
            }
            case 2: {
                midiaDAO.listarMidia();
                break;
            }
            case 3: {
                vender();
                break;
            }
            case 4: {
                pesquisa();
                break;
            }
            case 5: {
                System.out.println("Finalizando...");
                System.exit(0);
            }
            default:
                menu();
        }

        menu();
    }

    private static void cadastrarArtista() {

        System.out.println("-----------------------------------");
        System.out.println("1 - Banda");
        System.out.println("2 - Cantor");
        System.out.println("-----------------------------------");
        int tipo_artista;

        tipo_artista = sc.nextInt();
        
        switch (tipo_artista) {
            case 1: {
                Artista artista = new Banda();
                System.out.println("Nome: ");
                artista.setNome_artista(sc.next());
                System.out.println("Numero de membros: ");
                ((Banda) artista).setNum_membros(sc.nextInt());
                cadastrarMidia(artista);
                artistaDAO.cadastrar(artista);
                break;
            }
            case 2: {
                Artista artista = new Cantor();
                System.out.println("Nome: ");
                artista.setNome_artista(sc.next());
                System.out.println("Tempo de carreira: ");
                ((Cantor) artista).setTemp_carreira(sc.nextInt());
                cadastrarMidia(artista);
                artistaDAO.cadastrar(artista);
                break;
            }
            default:
                System.out.println("\nEscolha invalida");
                cadastrarArtista();
        }

    }

    private static void cadastrarMidia(Artista artista) {

        System.out.println("-----------------------------------");
        System.out.println("1 - CD");
        System.out.println("2 - DVD");
        System.out.println("-----------------------------------");
        int tipo_midia;

        tipo_midia = sc.nextInt();

        switch (tipo_midia) {
            case 1: {
                Midia midia = new Cd();
                System.out.println("Nome: ");
                midia.setNome_midia(sc.next());
                if (midiaDAO.consultar(midia.getNome_midia())) {
                    System.out.println("\nMidia ja existe");
                    menu();
                }    
                midia.setCodigo(gerarBarra());
                System.out.println("Preco: ");
                midia.setPreco(sc.nextDouble());
                System.out.println("Numero de faixas: ");
                ((Cd) midia).setNum_faixas(sc.nextInt());
                midia.setArtista(artista);
                System.out.println("Codigo de barras gerado!");
                System.out.println("codigo = " + midia.getCodigo());
                midiaDAO.cadastrar(midia);
                
                break;
            }
            case 2: {
                Midia midia = new Dvd();
                System.out.println("Nome: ");
                midia.setNome_midia(sc.next());
                if (midiaDAO.consultar(midia.getNome_midia())) {
                    System.out.println("\nMidia ja existe");
                    menu();
                } 
                midia.setCodigo(gerarBarra());
                System.out.println("Preco: ");
                midia.setPreco(sc.nextDouble());
                System.out.println("Tempo de duracao: ");
                ((Dvd) midia).setTemp_duracao(sc.next());
                midia.setArtista(artista);
                System.out.println("Codigo de barras gerado!");
                System.out.println("codigo = " + midia.getCodigo());
                midiaDAO.cadastrar(midia);
                
                break;
            }
            default:
                System.out.println("\nEscolha invalida");
                cadastrarMidia(artista);
        }

    }

    private static void vender() {
        System.out.println("Codigo de barras: ");
        midiaDAO.venderMidia(sc.next());
    }

    private static void pesquisa() {
        System.out.println("Insira o codigo da midia: ");
        String codigo = sc.next();
        int pos = midiaDAO.pesquisaPosicao(codigo);
        if (pos == -1) {
            System.out.println("\nMidia inexistente!");
        } else {
            System.out.println("\nMidia localizada na posicao: " + pos + "\n");
        }

    }
    
    private static String gerarBarra(){
        
        Random gerador = new Random();
        String aux = "";
        
        for(int i = 0; i<6; i++){
            
            aux = aux + String.valueOf(gerador.nextInt(10));
        }
        return aux;
    }
}
