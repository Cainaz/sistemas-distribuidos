/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barbeirothread;

/**
 *
 * @author Caina
 */
public class BarbeiroThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barbearia barbearia = new Barbearia(1);
        Barbeiro barbeiro = new Barbeiro(barbearia);
        Cliente c1 = new Cliente(1,barbearia);
        Cliente c2 = new Cliente(2, barbearia);
        Cliente c3 = new Cliente(3,barbearia);
        Cliente c4 = new Cliente(4, barbearia);
        Cliente c5 = new Cliente(5,barbearia);
        Cliente c6 = new Cliente(6, barbearia);
        Cliente c7 = new Cliente(7,barbearia);
        Cliente c8 = new Cliente(8, barbearia);
        Cliente c9 = new Cliente(9, barbearia);
        Cliente c10 = new Cliente(10,barbearia);
        Cliente c11 = new Cliente(11, barbearia);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        c11.start();
        barbeiro.start();
    }
    
}
