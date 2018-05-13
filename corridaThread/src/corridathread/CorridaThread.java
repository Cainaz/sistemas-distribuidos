/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corridathread;

/**
 *
 * @author Caina
 */
public class CorridaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Incrementar inc = new Incrementar();                               
        Carro c1 = new Carro(1,inc);
        Carro c2 = new Carro(2,inc);
        Carro c3 = new Carro(3,inc);
        c1.start();
        c2.start();
        c3.start();
        
        // TODO code application logic here
    }
    
}
