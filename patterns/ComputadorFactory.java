/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author patrick
 */
public class ComputadorFactory {
    
    private static final ComputadorFactory instancia = null;
    
    static ComputadorFactory getInstance() {
        
        if (instancia == null) 
            return new ComputadorFactory();
        
        return instancia;
    }
    
    public Computador criarComputador() {
        Computador facade = new Computador();
        
        facade.inicializar();
        
        return facade;
    }
    
}
