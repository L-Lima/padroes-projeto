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
public class CPU {
    
    public boolean executar(double processo) {
        System.out.println("Executando processo: " + processo);
        
        return true;
    }
    
    public boolean pularProcesso(double processo) {
        System.out.println("Pular processo: " + processo);

        return true;
    }
    
}
