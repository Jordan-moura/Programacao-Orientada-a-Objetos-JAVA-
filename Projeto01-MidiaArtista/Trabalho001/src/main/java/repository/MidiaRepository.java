package repository;

import models.Midia;

/**
 *
 * @author Beatriz de Oliveira Cavalheri RA 221150099
 * @author Gabriella Alves de Oliveira RA 211150959
 * @author Jordan Rodrigues Moura RA 201151031
 */
public interface MidiaRepository {
    
    boolean cadastrar(Midia midia);
    
    Midia getByCodigo(String codigo);
    
    void listarMidia();
    
    boolean consultar(String codigo);
    
    void venderMidia(String codigo);
    
    int pesquisaPosicao(String codigo);
      
}
