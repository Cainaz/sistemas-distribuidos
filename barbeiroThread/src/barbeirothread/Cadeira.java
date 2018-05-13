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
public class Cadeira {
    private boolean disponivel = true;
    
    public synchronized boolean sentar(){
        if(this.disponivel == true){
            this.disponivel =false;
            return true;
            //quero sentar 
            //então não está disponivel
        }else{
            this.disponivel = true;
            return false;
        }
        
    }
    public synchronized void levantar(){
        this.disponivel = true;
    }
    public boolean verCliente(){
        return this.disponivel;
    }
    
}
