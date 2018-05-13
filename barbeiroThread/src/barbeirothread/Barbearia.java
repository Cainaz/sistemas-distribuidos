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
public class Barbearia {
    Barbeiro barbeiro;
    private boolean cortando =true;
    private boolean any,barbeiroDormindo;
    Cadeira[] Ncadeiras;
    
    public Barbearia(int Ncadeiras){
        this.Ncadeiras = new Cadeira[Ncadeiras];
        for(int i =0;i < Ncadeiras;i++){
            this.Ncadeiras[i] = new Cadeira();
        }
    }
    
    public synchronized void entrarCliente(int idCliente, boolean atendido){
        for(int i=0; i < this.Ncadeiras.length;i++){
            if(this.Ncadeiras[i].sentar() == true){
                try{
                    if(this.barbeiroDormindo){
                        System.out.println("O cliente #"+idCliente+" acordou o barbeiro");
                    }
                    this.barbeiroDormindo =false;
                    System.out.println("O Cliente #"+idCliente+" está esperando na cadeira "+(i+1));
                    while(this.cortando == true){
                        wait();
                    }
                    CortarCabelo(idCliente);
                    this.cortando = false;
                    this.Ncadeiras[i].levantar();
                    notifyAll();
                    System.out.println("O cliente #"+idCliente+" foi embora após ser atendido");
                    atendido = true;
                    break;
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        if(atendido) {
        } else {
            System.out.println("O cliente #"+idCliente+" foi embora por falta de cadeiras");
        }
    }
    
    public synchronized void EntrarBarbeiro(){
        System.out.println("O barbeiro está entrando");
        this.cortando = false;
        notifyAll();
    }
    
    public synchronized void CortarCabelo(int idCliente){
        System.out.println("O Barbeiro está cortando o cabelo do Cliente #"+idCliente);
        for(int i=0; i< this.Ncadeiras.length;i++){
            if(this.Ncadeiras[i].verCliente() == false){
                //se tiver alguem
                break;
            }else{
                this.any = true;
            }
        }
        if(this.any){
            this.cortando = false;
            notifyAll();
        }else{
            System.out.println("O Barbeiro foi dormir");
            this.barbeiroDormindo = true;
            this.cortando = false;
            notifyAll();
        }
    }
}
