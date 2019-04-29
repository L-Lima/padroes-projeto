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
public class Computador {
    
    private CPU cpu;
    private Memoria memoria;
    private DiscoRigido discoRigido;
    private PlacaMae placaMae;
    
    public Computador() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.discoRigido = new DiscoRigido();
        this.placaMae = new PlacaMae();
    }
    
    public boolean inicializar() {
        System.out.println("Ligando computador...");
        this.placaMae.carregarBios();
        this.placaMae.carregarDispositivos();
        
        this.discoRigido.carregarSistemaOperacional();        
        this.memoria.carregarProcessos();
        
        for (int i=0; i<5; i++) 
            this.cpu.executar(i);
                
        return true;
    }
    
    public boolean desligar() {
        System.out.println("Desligando computador...");
        
        return true;
    }
    
}
