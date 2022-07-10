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
public class Cliente extends Thread{
    private int idCliente;
    Barbearia barbearia;
    private boolean atendido;
    
    public Cliente(int id,Barbearia b){
        this.idCliente = id;
        this.barbearia = b;
    }
    @Override
    public void run(){
        this.barbearia.entrarCliente(this.idCliente, this.atendido);
    }
    
    
}
