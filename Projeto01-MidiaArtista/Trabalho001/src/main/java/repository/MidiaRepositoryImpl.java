package repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import models.Midia;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public class MidiaRepositoryImpl implements MidiaRepository {

    private static List<Midia> midias = new ArrayList<>();
    
    @Override
    public boolean cadastrar(Midia midia) {
        if (getByCodigo(midia.getCodigo()) != null) {
            return false;
        }
        return midias.add(midia);
    }
    
    @Override
    public Midia getByCodigo(String codigo) {
        for (Midia midia : midias) {
            if (midia.getCodigo().equals(codigo)) {
                return midia;
            }
        }
        return null;
    }
    @Override
    public int pesquisaPosicao(String codigo) {
        int i = 0;
        for (Midia midia : midias) {
            if (midia.getCodigo().equals(codigo)) {
                return i;
            }
            i++;
        }
        return -1;
    }
    @Override
    public boolean consultar(String nome_midia) {
        for (Midia midia : midias) {
            if (midia.getNome_midia().equals(nome_midia)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void listarMidia(){
        
        System.out.println("");
        System.out.println("Listagem de Midias");
        System.out.println("");
        for (Midia midia : midias) { 
            System.out.println("-----------------------------------");
            System.out.println(midia.toString());
        } //       System.out.println(midias);
        System.out.println("-----------------------------------");
    }

    @Override
    public void venderMidia(String codigo)
    {
        Midia a = new Midia();
        a = getByCodigo(codigo);
        if (a == null)
        {
            System.out.println("\nCodigo inexistente");
            return;
        }
        else{
            midias.remove(a);
        }
    }
    
}
