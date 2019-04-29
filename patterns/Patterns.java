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
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputadorFactory computadorFactory;
        
        computadorFactory = ComputadorFactory.getInstance();
        
        Computador novoComputador = computadorFactory.criarComputador();
    }
    
}
