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
public class Barbeiro extends Thread{
    Barbearia barbearia;
    
    public Barbeiro(Barbearia b){
        this.barbearia = b;
    }
    @Override
    public void run(){
        this.barbearia.EntrarBarbeiro();
    }
}
