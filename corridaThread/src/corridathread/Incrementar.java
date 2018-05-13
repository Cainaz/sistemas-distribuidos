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
public class Incrementar {
    private int posicao = 0;
    synchronized int incrementar(){
        this.posicao = this.posicao + 1;
        return this.posicao;
    }
}
