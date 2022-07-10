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

public class Carro extends Thread{
    private int id;
    private int tempo;
    private int tempoTotal;
    private int posicaoCarro;
    private Incrementar incrementador;
    
    public Carro(int id,Incrementar x){
        this.id = id;
        this.incrementador = x;
    }

    public void run(){
        for(int i=0;i < 5;i++){
            this.tempo = (int)(Math.random()*121);
            this.tempoTotal = this.tempoTotal + this.tempo;
            try{
                Thread.sleep(this.tempo/60);
            }catch(Exception e){
                e.printStackTrace();
            }
            /*System.out.println("O Carro #"+ this.id + " Levou"+ this.tempo +"segundos");*/
        }
        this.posicaoCarro = this.incrementador.incrementar();
        System.out.println("O carro"+id+" Chegou na posicao: " + this.posicaoCarro+" e levou "+ this.tempoTotal+" segundos");
    }
    
}
