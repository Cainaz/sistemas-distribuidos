/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.time.Instant;

/**
 *
 * @author Luiz Guilherme
 */
public class BuscaPararela extends Thread {
    int valor;
    int [] elementos;
    int inicio;
    int fim;
    String nome;

    BuscaPararela(String nome, int valor, int[] elementos, int inicio, int fim) {
        this.valor = valor;
        this.elementos = elementos;
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        start();
    }

    boolean buscaVetor(int[] vetor, int valor, int inicio, int fim) {
        Instant start = Instant.now();
        for (int i = this.inicio; i < this.fim; i++) {
            if (vetor[i] == valor) {
                System.out.println(this.nome + " encontrou elemento " + this.valor + " na posição: " + i + "; tempo: " + (Instant.now().toEpochMilli() - start.toEpochMilli()));
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        /*if(!*/buscaVetor(this.elementos, this.valor, this.inicio, this.fim);/*)*/
            //System.out.println("Elemento " + this.valor + " nao presente no vetor");
    }
}
